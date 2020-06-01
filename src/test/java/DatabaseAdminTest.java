import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Fra", "zzz123", 100000.00 );
    }

    @Test
    public void canGetName() {
        assertEquals("Fra", databaseAdmin.getName() );
    }

    @Test
    public void canGetNIN() {
        assertEquals("zzz123", databaseAdmin.getNIN());
    }

    @Test
    public void canGetSalary() {
        assertEquals(100000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000.00, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void canHaveAPayRise() {
        databaseAdmin.raiseSalary(databaseAdmin.payBonus());
        assertEquals(101000.00, databaseAdmin.getSalary(), 0.01);
    }
    @Test
    public void canNotRaiseTheSalaryWithANegativeValue() {
        databaseAdmin.raiseSalary(-1000.00);
        assertEquals(100000.00, databaseAdmin.getSalary(), 0.01);
    }

}
