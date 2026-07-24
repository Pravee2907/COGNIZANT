import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class Ex4Test {

    Calculator c;

    @BeforeEach
    public void start() {
        c = new Calculator();
        System.out.println("Start Test");
    }

    @AfterEach
    public void end() {
        System.out.println("End Test");
    }

    @Test
    public void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int ans = c.add(a, b);

        // Assert
        assertEquals(30, ans);
    }
}