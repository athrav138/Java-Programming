import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebooks",
                "root",
                "Aps@8830"
            );

            System.out.println("Connected to MySQL successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}