import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    static Logger log = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        log.error("Error Message");

        log.warn("Warning Message");
    }
}