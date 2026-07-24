import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex2Test {

    @Test
    public void testAdd() {

        Calculator c = new Calculator();

        int ans = c.add(10, 20);

        assertEquals(30, ans);
    }

    @Test
    public void testSub() {

        Calculator c = new Calculator();

        int ans = c.sub(20, 10);

        assertEquals(10, ans);
    }
}
