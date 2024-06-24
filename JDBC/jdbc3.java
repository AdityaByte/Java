// Insert data (Dynamic data) using prepared statement in jdbc

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc3 {
    public static void main(String[] args) {
        try{
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // creating the connection 
            String url = "jdbc:mysql://localhost:3306/adityadatabase";
            String username = "root";
            String password = "aditya";
            Connection connection = DriverManager.getConnection(url, username, password);
            if(connection.isClosed()){
                System.out.println("connection is closed right now");
            }
            else{
                System.out.println("connection established");
            }
            // Creating a query
            String query = "insert into table1(tName,tCity) values(?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            // inserting static data to database
            preparedStatement.setString(1, "abhi");
            preparedStatement.setString(2, "california");
            preparedStatement.executeUpdate();

            System.out.println("Data inserted...");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}