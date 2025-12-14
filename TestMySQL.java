import java.sql.*;

public class TestMySQL {
    public static void main(String[] args) {
        try {
            // Driver load
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Library",
                "Connection1",
                "atharv8830"   // <-- put your MySQL password
            );

            System.out.println("MySQL connected successfully!");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
