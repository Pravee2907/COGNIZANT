import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Ex2Test {

    @Test
    public void testCall() {

        ExternalApi a = mock(ExternalApi.class);

        MyService m = new MyService(a);

        m.fetchData();

        verify(a).getData();
    }
}