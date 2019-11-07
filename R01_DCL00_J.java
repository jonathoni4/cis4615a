
//Jonathon Irigoyen
//Rule 1 Declarations and Initialization
// https://wiki.sei.cmu.edu/confluence/display/java/DCL00-J.+Prevent+class+initialization+cycles

public class R06_MET01_J {
  private final int balance;
  private static final Cycle c = new Cycle();
  private static final int deposit = (int) (Math.random() * 100); // Random deposit

  public Cycle() {
    balance = deposit - 20; // Subtract processing fee
  }

  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
  }
}
