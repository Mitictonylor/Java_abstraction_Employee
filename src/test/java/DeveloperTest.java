import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Fra", "zzz123", 100000.00 );
    }

    @Test
    public void getName() {
        assertEquals("Fra", developer.getName() );
    }
}
