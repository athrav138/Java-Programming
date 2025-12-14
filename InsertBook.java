import java.sql.*;
import java.util.Scanner;

public class InsertBook {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Library",
                "root",
                "atharv8830"   // your MySQL password
            );

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO Books (ID, B_NAME) VALUES (?, ?)"
            );
            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();
            System.out.println("Book inserted successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
