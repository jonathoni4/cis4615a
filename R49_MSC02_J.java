//Jonathon Irigoyen
// Generate Strong random numbers
// https://wiki.sei.cmu.edu/confluence/display/java/MSC02-J.+Generate+strong+random+numbers
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;

public class R49_MSC02_J {



  public static void main(String[] args) {
    SecureRandom number = new SecureRandom();
   // Generate 20 integers 0..20
   for (int i = 0; i < 20; i++) {
     System.out.println(number.nextInt(21));
   }
  }
}
