// Inserting image in database using prepared statement in java
// blob - binary large object
// blob has three types -  blob,Mediumblob,longblob

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc5 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver
            // Creating a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adityadatabase", "root", "aditya");
            // creating a query
            String query = "insert into images(pic) values(?)";
            // inserting dynamic data through prepared statement
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            // Declaring the location of image using fileinputStream 
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\HP\\OneDrive\\Documents\\aditya pawar\\signature.jpg");
            
            preparedStatement.setBinaryStream(1, fileInputStream , fileInputStream.available());
            preparedStatement.executeUpdate();
            System.out.println("images is inserted ... \n done...");
        }
        catch(Exception e){
            System.out.println("error....");
        }
    }
}
