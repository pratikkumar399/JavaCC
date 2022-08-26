package basicprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Databases {
    static Connection connection = null;
    static String databasename = "registration";
    
    static String url = "jdbc:mysql://localhost:3306/" + databasename;
    static String username = "root";
    static String password = "";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
      
                Statement stmt = conn.createStatement();) {
            System.out.println("Inserting records into the table...");
            String sql = "Insert Into Employee Values(1,'Pratik','Rai',18);";
            stmt.executeUpdate(sql);
            sql = "Insert Into Employee Values(2, 'Patrik', 'Rai',18);";
            stmt.executeUpdate(sql);
            sql = "Insert Into Employee Values(3, 'Hello', 'Sharma', 17)";
            stmt.executeUpdate(sql);
            sql = "Insert Into Employee Values(4, 'Kumar', 'Verma', 19)";
            stmt.executeUpdate(sql);
            sql = "Insert Into Employee Values(5, 'Verma', 'Sharma', 20);";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
