import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Fra", "zzz123", 100000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Fra", developer.getName());
    }

    @Test
    public void canGetNIN() {
        assertEquals("zzz123", developer.getNIN());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000.00, developer.payBonus(), 0.01);
    }

    @Test
    public void canHaveAPayRise() {
        developer.raiseSalary(developer.payBonus());
        assertEquals(101000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canNotRaiseTheSalaryWithANegativeValue() {
        developer.raiseSalary(-1000.00);
        assertEquals(100000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canNotSetANullName() {
        developer.setName("");
        assertEquals("Fra", developer.getName());
    }

    @Test
    public void canSetAName() {
        developer.setName("Antonio");
        assertEquals("Antonio", developer.getName());
    }

}
