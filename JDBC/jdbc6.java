import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class jdbc6 {
    public static void main(String[] args) {
        try {
           Connection connection = ConnectionProvider.getConnection();

           String query = "insert into images(pic) values(?)";

           PreparedStatement preparedStatement = connection.prepareStatement(query);

           JFileChooser jfc = new JFileChooser();
           jfc.showOpenDialog(null);
           File file = jfc.getSelectedFile();

           FileInputStream fis = new FileInputStream(file);

           preparedStatement.setBinaryStream(1, fis , fis.available());

           preparedStatement.executeUpdate();

           System.out.println("done...");

           JOptionPane.showMessageDialog(null, "success.");

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
