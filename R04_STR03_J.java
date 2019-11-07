//Jonathon Irigoyen
//Characters and Strings
// https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string

import java.math.BigInteger;

public class R04_STR03_J {

  public static void main(String[] args) {

    BigInteger x = new BigInteger("530500452766");
    BigInteger original = new BigInteger("530500452766");

    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);


    if(x.equals(original)){
      System.out.println("Correct BigInteger.");
    }
    else {
      System.out.println("Incorrect BigInteger");
    }

}

}
