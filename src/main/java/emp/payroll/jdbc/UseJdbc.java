package emp.payroll.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UseJdbc {
    private static Connection connection;
    private static Statement statement;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/payroll_service?user=root&password=root";

    static {
        try {
            connection = DriverManager.getConnection(JDBC_URL);
            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static Connection useConnection() {
        return connection;
    }

    static Statement useStatement() throws SQLException {
        return connection.createStatement();
    }
}
