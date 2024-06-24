// selecting a particular item using java jdbc

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jdbc10 {
    public static void main(String[] args) {
        try(Connection connection = ConnectionProvider.getConnection()){
            Scanner s = new Scanner(System.in);
            String query = "select * from table1 where tId = ?";
            System.out.print("Enter id => ");
            int id = Integer.parseInt(s.nextLine());
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet set = preparedStatement.executeQuery();
            while(set.next()){
                int id1 = set.getInt("tId");
                String name = set.getString("tName");
                String city = set.getString("tCity");
                System.out.println(id1 + " : " + name + " : " + city );
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
