import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    public static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    public static boolean loginSuccessful = true;
    public static String correctUsername = "this is my username 1234";
    public static String incorrectUsername = "username123";

    public static String inputValidationAndSanitization(String username) {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }

        return sanitizeUser(username);
    }

    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }

    public static void main(String[] args) {
        System.out.println(inputValidationAndSanitization(incorrectUsername));
        System.out.println(inputValidationAndSanitization(correctUsername));
    }
}