import java.sql.*;

public class StudentTableDemo {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "Aps@8830"
            );

            Statement st = con.createStatement();

            st.executeUpdate("CREATE DATABASE IF NOT EXISTS ebooks");
            st.executeUpdate("USE ebooks");

            st.executeUpdate("CREATE TABLE IF NOT EXISTS student (id INT, name VARCHAR(50))");

            st.executeUpdate("INSERT INTO student VALUES (1, 'Atharv')");
            st.executeUpdate("INSERT INTO student VALUES (2, 'Rucha')");
            st.executeUpdate("INSERT INTO student VALUES (3, 'Rahul')");

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            System.out.println("Student Records:");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}