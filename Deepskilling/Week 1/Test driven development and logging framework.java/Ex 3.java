import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex3Test {

    @Test
    public void testCheck() {

        int a = 15;
        int b = 5;

        assertEquals(20, a + b);

        assertTrue(a > b);

        assertFalse(a < b);

        String s = null;
        assertNull(s);

        String name = "Java";
        assertNotNull(name);
    }
}