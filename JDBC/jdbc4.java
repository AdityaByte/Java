import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc4 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver
            // Creating a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adityadatabase", "root", "aditya");
            // creating a query
            String query = "insert into table1(tName,tCity) values(?,?)";
            // inserting dynamic data through prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Dynamic data insertion
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Name -> ");
            String name = bufferedReader.readLine();
            System.out.print("Enter City -> ");
            String city = bufferedReader.readLine();

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, city);

            preparedStatement.executeUpdate();
            System.out.println("Data has been inserted successfully....");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}
