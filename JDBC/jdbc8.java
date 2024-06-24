// Selecting data or fetching data from database to java application using jdbc

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class jdbc8 {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionProvider.getConnection();

            String query = "select * from table1";

            Statement stmt = connection.createStatement();
            ResultSet set = stmt.executeQuery(query);
            // for printing the table items

            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                String city = set.getString(3);
                System.out.println(id + ":" + name + ":" + city);
            }
            connection.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
