import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ex1Test {

    @Test
    public void testData() {

        ExternalApi api = mock(ExternalApi.class);

        when(api.getData()).thenReturn("Hello");

        MyService s = new MyService(api);

        String ans = s.fetchData();

        assertEquals("Hello", ans);
    }
}