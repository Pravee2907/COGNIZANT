class Logger {

    private static Logger obj;

    private Logger() {
        System.out.println("Logger Initialized");
    }

    public static Logger getLogger() {
        if (obj == null) {
            obj = new Logger();
        }
        return obj;
    }
}

public class Ex1 {

    public static void main(String[] args) {

        Logger log1 = Logger.getLogger();
        Logger log2 = Logger.getLogger();

        System.out.println(log1 == log2);

        if (log1 == log2) {
            System.out.println("Same Logger Object");
        } else {
            System.out.println("Different Logger Objects");
        }
    }
}
