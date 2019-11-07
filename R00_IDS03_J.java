//Jonathon Irigoyen
//Input Validation and Data Sanitization
// https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
import java.util.logging.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R00_IDS03_J {

  public static void main(String[] args){

    boolean loginSuccessful = false;
    String username = "Jonathon@";
    Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
}

public static String sanitizeUser(String username) {
  return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
}
}
