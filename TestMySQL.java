import java.sql.Connection;
import java.sql.DriverManager;

public class TestMySQL {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Library",
                "root",          // MySQL username
                "atharv8830"       // <-- replace with your MySQL password
            );

            System.out.println("MySQL connected successfully!");

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
