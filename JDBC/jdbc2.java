// In this java program we are handling quering and applying CRUD operation to database

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc2 {
    public static void main(String[] args) {
        try{
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection
            String url = "jdbc:mysql://localhost:3306/adityadatabase";
            String username = "root";
            String password = "aditya";
            Connection connection = DriverManager.getConnection(url,username,password);
            if(connection.isClosed()){
                System.out.println("Connection is closed right now");
            }
            else{
                System.out.println("Connection created.....");
            }

            // creating a query
            String q = "create table table1(tId int(20) primary key auto_increment , tName varchar(200) not null , tCity varchar(400))";
            
            // creating statement
            Statement statement = connection.createStatement();
            statement.executeUpdate(q);
            System.out.println("table created in database");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
