package emp.payroll.jdbc;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import org.junit.Test;

import java.sql.SQLException;

public class EmployeePayrollTest {

    @Test
    public void getUpdatedSalaryTest() throws SQLException {
        try {
            Assert.assertEquals(3e6, UpdateEmpSal.getUpdatedSalary());
        } catch (AssertionFailedError exc) {
            throw new EmployeePayrollException("Actual and expected salary differs for employee!");
        }
    }
}
