package emp.payroll.jdbc;

import java.sql.*;

public class UpdateEmpSal {

    private static final String QUERY = "UPDATE employee_payroll SET salary = 3e6 WHERE name = 'Terissa';";

    static double getUpdatedSalary() throws SQLException {
        Connection con = UseJdbc.useConnection();
        PreparedStatement prepareStatement = con.prepareStatement(QUERY);
        prepareStatement.executeUpdate();

        Statement statement = UseJdbc.useStatement();
        ResultSet resultSet = statement.executeQuery("SELECT salary from employee_payroll WHERE name = 'Terissa';");

        resultSet.next();
        double salary = resultSet.getDouble(1);
        con.close();
        System.out.println("Connection closed successfully!");
        return salary;
    }
}
