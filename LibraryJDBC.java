import java.sql.*;

public class LibraryJDBC {
    public static void main(String[] args) {
        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Library",
                "Connection1",        // username
                "atharv8830"     // password
            );

            // 3. Create statement
            Statement stmt = con.createStatement();

            // 4. Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM Books");

            // 5. Process result
            while (rs.next()) {
                System.out.println(
                    rs.getInt("ID") + "  " + rs.getString("B_NAME")
                );
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
