package emp.payroll.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmpSal {

    private static final String QUERY = "UPDATE employee_payroll SET salary = 3e6 WHERE name = 'Terissa';";

    static double getUpdatedSalary() throws SQLException {
        Statement statement = UseJdbc.useStatement();
        statement.executeUpdate(QUERY);
        ResultSet resultSet = statement.executeQuery("SELECT salary from employee_payroll WHERE name = 'Terissa';");

        resultSet.next();
        double salary = resultSet.getDouble(1);
        UseJdbc.useConnection().close();
        System.out.println("Connection closed successfully!");
        return salary;
    }
}
