import java.sql.*;
import java.util.Scanner;

public class UpdateBook {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Library",
                "root",
                "atharv8830"
            );

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Book ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new Book Name: ");
            String name = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "UPDATE Books SET B_NAME=? WHERE ID=?"
            );
            ps.setString(1, name);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("Book updated successfully!");
            else
                System.out.println("Book not found!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
