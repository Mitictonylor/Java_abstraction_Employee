import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Francesco", "abc123", 90000.00,"production", 20000.00 );
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
        assertEquals(90000.00, director.getSalary(),0.01);
    }
    @Test
    public void canGetDeptName() {
        assertEquals("production", director.getDeptName());
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(900.00, director.payBonus(), 0.01);
    }

    @Test
    public void canRaiseTheSalary() {
        director.raiseSalary(director.payBonus());
        assertEquals(90900.00, director.getSalary(), 0.01);
    }
}
