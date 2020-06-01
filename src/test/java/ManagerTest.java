import Staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Francesco", "abc123", 90000.00,"production" );
    }

    @Test
    public void canGetName() {
        assertEquals("Francesco", manager.getName());
    }
    @Test
    public void canGetNIN() {
        assertEquals("abc123", manager.getNIN());
    }
    @Test
    public void canGetSalary() {
        assertEquals(90000.00, manager.getSalary(),0.01);
    }
    @Test
    public void canGetDeptName() {
        assertEquals("production", manager.getDeptName());
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(900.00, manager.payBonus(), 0.01);
    }

    @Test
    public void canRaiseTheSalary() {
        manager.raiseSalary(manager.payBonus());
        assertEquals(90900.00, manager.getSalary(), 0.01);
    }
}
