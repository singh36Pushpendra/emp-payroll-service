package emp.payroll.jdbc;

import java.sql.*;

public class EmployeePayrollMain {
    public static void main(String[] args) {
        final String SELECT_QUERY = "SELECT * FROM employee_payroll;";
        System.out.println("Welcome to JDBC for Employee Payroll!");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "root")) {
            System.out.println("Connection established successfully!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_QUERY);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " ... "
                 + resultSet.getString(2) + " ... "
                 + resultSet.getDouble(3) + " ... "
                 + resultSet.getDate(4) + " ... "
                 + resultSet.getString(5) + " ... "
                 + resultSet.getLong(6) + " ... "
                 + resultSet.getString(7) + " ... "
                 + resultSet.getString(8) + " ... "
                 + resultSet.getDouble(9) + " ... "
                 + resultSet.getDouble(10) + " ... "
                 + resultSet.getDouble(11) + " ... "
                 + resultSet.getDouble(12) + " ... "
                 + resultSet.getDouble(13) + " ... ");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

