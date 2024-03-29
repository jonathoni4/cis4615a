//Jonathon Irigoyen
//Characters and Strings
// https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string

import java.math.BigInteger;

public class R04_STR03_J {

  public static void main(String[] args) {

    BigInteger x = new BigInteger("530500452766");
    BigInteger original = new BigInteger("530500452766");
    String s = x.toString(); //Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray);
    x = new BigInteger(ns);
    
    if(ns.equals("530500452766")){
      System.out.println("Correct BigInteger.");
    }
    else {
      System.out.println("Incorrect BigInteger");
    }

}

}
