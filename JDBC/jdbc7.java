// updating data of table in database using jdbc java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class jdbc7 {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionProvider.getConnection();

            String query = "update table1 set tName=? , tCity=? where tId=?";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Id -> ");
            int id = Integer.parseInt(br.readLine());
            System.out.print("Enter Name -> ");
            String name = br.readLine();
            System.out.print("Enter City -> ");
            String city = br.readLine();
            
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);

            pstmt.executeUpdate();

            System.out.println("Updated data successfully...");

            connection.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
