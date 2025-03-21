package insta;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/intramart", "root", "root");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}