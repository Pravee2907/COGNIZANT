import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex1Test {

    @Test
    public void testOne() {

        int a = 10;
        int b = 20;

        int ans = a + b;

        assertEquals(30, ans);
    }
}