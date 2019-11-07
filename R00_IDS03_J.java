//Jonathon Irigoyen
//Input Validation and Data Sanitization
// https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
import java.util.logging.*;

public class R00_IDS03_J {

  public static void main(String[] args){

    boolean loginSuccessful = true;
    String username = "Jonathon";
    Logger logger = Logger.getLogger(R00_IDS03_J.class.getName()); 
    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
  }
}
}
