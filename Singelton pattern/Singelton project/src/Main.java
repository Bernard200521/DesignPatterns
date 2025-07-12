public class Main {
    public static void main(String[] args) {

        // Get two references to Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Log some messages
        logger1.log("This is the first log message.");
        logger2.log("This is the second log message.");

        // Check if both references are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (Singleton works!).");
        } else {
            System.out.println("Logger instances are different (Singleton failed!).");
        }
    }
}

