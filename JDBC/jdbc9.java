// Checking a table exist in a database or not using jdbc 

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbc9{

    private static boolean doesTableExist(Connection connection , String tableName) throws SQLException{
        DatabaseMetaData metaData = connection.getMetaData();
        try(ResultSet resultSet = metaData.getTables(null, null, tableName, new String[] {"TABLE"})){
            return resultSet.next();
        }
    }
    public static void main(String[] args) throws Exception{
        try (Connection connection = ConnectionProvider.getConnection()){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter table name => ");
            String tableName = s.next();
            if(doesTableExist(connection, tableName)){
                System.out.println("yes it exists");
            }
            else{
                System.out.println("no its not");
            }
        }
    }
}