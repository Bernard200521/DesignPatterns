public class Logger {

    // Step 1: Private static instance of the same class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 3: Public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
