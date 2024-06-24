import java.util.HashMap;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

class CreateConnection{

    private static Connection con;

    public static Connection getConnection(){
        try{
            if(con==null){
                // Load the driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Create the connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adityadatabase", "root", "aditya");
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}


class SetDataFromUser{

    // Getting connection object from other class
    public static Connection con = CreateConnection.getConnection();
    // Defining query
    public static String q = "insert into table2(rollNo,studentName,enrollNum) values(?,?,?)";
    //Creating prepared statment

    // Creating other datatypes
    public static Scanner s = new Scanner(System.in);
    public static HashMap<Integer , String> hm1 = new HashMap<>();
    public static HashMap<Integer , String> hm2 = new HashMap<>();
    public static void setData(){
        System.out.println("im in the set data method");
    try{
        System.out.print("How much data you want to enter => ");
        int i1 = Integer.parseInt(s.nextLine());
        for(int i=1; i<=i1; i++){
            System.out.print(" Enter Student rollno => ");
            int rNo = Integer.parseInt(s.nextLine());
            System.out.print("Enter Student Name => ");
            String sName = s.nextLine();
            System.out.print("Enter student enrollment number => ");
            String eNum = s.nextLine();
            hm1.put(i, sName);
            hm2.put(i, eNum);
            // Creating prepare statement
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, rNo);
            pstmt.setString(2 , sName);
            pstmt.setString(3, eNum);
            pstmt.executeUpdate();
        }
        System.out.println("Data is successfully injected to the database...");
        }
        catch(Exception e){
            System.out.println("User you must be carefull in entering data");
            setData();
        }
    }
}

class GetDataFromDatabase{
    public static Connection con = CreateConnection.getConnection();
    public static Scanner s = SetDataFromUser.s;
    public static void getData() throws Exception{
        System.out.print("Would you like to fetch all data (all) or of a particular person(p) -> ");
        String ans = s.nextLine();
        if(ans.equals("all")){
            String query = "select * from table2";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(query);

            while (set.next()) {
                int rNo = set.getInt("rollNo");
                String sName = set.getString("studentName");
                String eNum = set.getString("enrollNum");
                System.out.println(rNo + " : " + sName + " : " + eNum );
            }
        }
        else if(ans.equals("p")){
            System.out.println("Enter the Student Roll Number -> ");
            int rNum = Integer.parseInt(s.nextLine());
            String query = "select * from table2 where rollNo = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, rNum);
            ResultSet set = pstmt.executeQuery();
            while (set.next()) {
                int rollNo = set.getInt(1);
                String studentName = set.getString(2);
                String enrollNum = set.getString(3);
                System.out.println(rollNo + " : " + studentName + " : " + enrollNum);
            }
        }
    }
}

class DeleteDataFromDatabase{
    public static void delete(Connection connection , Scanner s) throws Exception{
        String query = "delete from table2 where rollNo = ?";
        System.out.print("Enter the roll no of the student whom you want to delete > ");
        int rNo = Integer.parseInt(s.nextLine());
        PreparedStatement pstmt = connection.prepareStatement(query);
        pstmt.setInt(1, rNo);
        pstmt.executeUpdate();
        System.out.println("data successfully deleted from database");
    }
}

public class Test {

    private static void set_get_func(Connection connection , Scanner s) throws Exception{
        System.out.print("You want to add data in database -> (y/n)");
        String ask = s.nextLine();
        System.out.println(ask);

        switch (ask) {
            case "y":
                System.out.println("ok set data");
                SetDataFromUser.setData();
                break;
            case "n":
                System.out.println("ok closing the connection..");
                connection.close();
                break;
        }
        
    }

    private static boolean doesTableExist(Connection connection , String tableName) throws SQLException{
        DatabaseMetaData metaData = connection.getMetaData();
        try(ResultSet resultSet = metaData.getTables(null, null, tableName, new String[] {"TABLE"})){
            return resultSet.next();
        }
    }
    public static void main(String[] args) {
        try(Connection connection = ConnectionProvider.getConnection()){
            Scanner s = SetDataFromUser.s;
            if(doesTableExist(connection, "table2")){
                System.out.println("yes table existed");
                set_get_func(connection, s);
                System.out.print("Do you want to get the data ? (y/n) - ");
                String ans = s.nextLine();
                switch (ans) {
                    case "y":
                        GetDataFromDatabase.getData();
                        break;
                    case "n":
                        System.out.println("have a good day bye...");
                        break;
                }
                System.out.print("Do you want to delete the data of any user ? (y/n) - ");
                String ans1 = s.nextLine();
                switch (ans1) {
                    case "y":
                        DeleteDataFromDatabase.delete(connection, s);
                        break;
                    case "n":
                        System.out.println("ok...");
                        connection.close();
                        break;
                }
                connection.close();
            }
            else{
                System.out.println("Table is not created yet do you want to create table ? (y/n)");
                String value = s.nextLine();
                switch (value) {
                    case "y":
                        // writing a query
                        String q1 = "create table table2(rollNo int(20) primary key , studentName varchar(200) not null , enrollNum varchar(100) not null)";
                        Statement stmt = connection.createStatement();
                        stmt.executeUpdate(q1);
                        System.out.println("table is created...");
                        set_get_func(connection, s);
                        System.out.print("Do you want to get the data ? (y/n) ");
                        String ans = s.nextLine();
                        switch (ans) {
                            case "y":
                                GetDataFromDatabase.getData();
                                break;
                            case "n":
                                System.out.println("have a good day bye...");
                                break;
                        }
                        break;
                
                    case "n":
                        System.out.println("ok...");
                        break;
                    default:
                        break;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
