import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db", "root", "root");
        PreparedStatement ps = con.prepareStatement("update emp set salary=? where id=?");
        ps.setDouble(1, 50000); ps.setInt(2, 101); ps.executeUpdate();
        System.out.println("Updated");
    }
}
