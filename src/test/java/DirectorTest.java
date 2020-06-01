import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void setUp() {
        director = new Director("Francesco", "abc123", 90000.00, "production", 20000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Francesco", director.getName());
    }

    @Test
    public void canGetNIN() {
        assertEquals("abc123", director.getNIN());
    }

    @Test
    public void canGetSalary() {
        assertEquals(90000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("production", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(20000.00, director.getBudget(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(1800.00, director.payBonus(), 0.01);
    }

    @Test
    public void canRaiseTheSalary() {
        director.raiseSalary(director.payBonus());
        assertEquals(91800.00, director.getSalary(), 0.01);
    }

    @Test
    public void canNotRaiseTheSalaryWithANegativeValue() {
        director.raiseSalary(-1000.00);
        assertEquals(90000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canNotSetANullName() {
        director.setName("");
        assertEquals("Francesco", director.getName());
    }

    @Test
    public void canSetAName() {
        director.setName("Antonio");
        assertEquals("Antonio", director.getName());
    }
}
