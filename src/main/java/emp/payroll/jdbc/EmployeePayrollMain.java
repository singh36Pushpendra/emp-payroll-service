package emp.payroll.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollMain {
    public static void main(String[] args) {
        System.out.println("Welcome to JDBC for Employee Payroll!");
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "root")) {
            System.out.println("Connection established successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

