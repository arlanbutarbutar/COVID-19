package covid.pkg19;
import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {
    private static Connection koneksimysql;
    public static Connection Now() {
        if (koneksimysql==null){
            try {
                String DB="jdbc:mysql://localhost:3306/covid_19"; // nama database
                String user="root"; // user database
                String pass="ArlanBB270899"; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksimysql = DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi Database Gagal.");
            }
        }
        return koneksimysql;
    }
}
