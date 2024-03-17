package Application.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HiltonHotelRepository {
    private static final String URL = "jdbc:postgresql://localhost:5432/hiltonhotelmanagement";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
