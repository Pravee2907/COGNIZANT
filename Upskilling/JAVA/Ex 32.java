import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class StudentDAO {

    String url = "jdbc:mysql://localhost:3306/studentdb";
    String user = "root";
    String password = "root";

    void insertStudent(int id, String name, int age) {

        String query = "INSERT INTO students VALUES (?, ?, ?)";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record inserted");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    void updateStudent(int id, String name) {

        String query = "UPDATE students SET name = ? WHERE id = ?";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record updated");

            ps.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}

class JDBCTest {
    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.insertStudent(101, "Ravi", 20);

        dao.updateStudent(101, "Arun");
    }
}