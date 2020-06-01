import Staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import static org.junit.Assert.assertEquals;

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
}
