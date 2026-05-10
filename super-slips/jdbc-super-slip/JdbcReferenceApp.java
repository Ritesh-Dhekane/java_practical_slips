import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcReferenceApp {
    private static final String URL = "jdbc:mysql://localhost:3306/college_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        System.out.println("=== JDBC Super Slip ===");
        System.out.println("Connecting to: " + URL);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("MySQL JDBC driver not found. Add Connector/J to the classpath.");
            return;
        }

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            createTable(connection);
            insertSampleRecords(connection);
            displayAllStudents(connection);
        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS super_students ("
                   + "id INT PRIMARY KEY AUTO_INCREMENT, "
                   + "name VARCHAR(50) NOT NULL, "
                   + "course VARCHAR(40) NOT NULL, "
                   + "marks INT NOT NULL)";

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("Table checked/created successfully.");
        }
    }

    private static void insertSampleRecords(Connection connection) throws SQLException {
        String insertSql = "INSERT INTO super_students(name, course, marks) VALUES (?, ?, ?)";
        String[][] students = {
            {"Amit Sharma", "MCA", "82"},
            {"Priya Patel", "MCA", "76"},
            {"Rohan Desai", "MBA", "68"}
        };

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSql)) {
            for (String[] student : students) {
                preparedStatement.setString(1, student[0]);
                preparedStatement.setString(2, student[1]);
                preparedStatement.setInt(3, Integer.parseInt(student[2]));
                preparedStatement.executeUpdate();
            }
            System.out.println("Inserted " + students.length + " sample records.");
        }
    }

    private static void displayAllStudents(Connection connection) throws SQLException {
        String selectSql = "SELECT id, name, course, marks FROM super_students ORDER BY id";

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            System.out.println();
            System.out.println("ID\tName\t\tCourse\tMarks");
            System.out.println("----------------------------------------------");

            while (resultSet.next()) {
                System.out.printf("%d\t%-16s%-8s%d%n",
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("course"),
                    resultSet.getInt("marks"));
            }
        }
    }
}
