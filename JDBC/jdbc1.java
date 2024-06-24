// creating connection in java from java program to jdbc

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc1 {
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
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}