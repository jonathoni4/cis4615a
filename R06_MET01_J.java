
//Jonathon Irigoyen
//MET01 vulnerability solution

public class R06_MET01_J {

  public static void main(String[] args) {
  int a = 17;
  int b = 42;
  int c = getAbsAdd(a,b);
  System.out.println("c = " + c);

  a = Integer.MIN_VALUE; //Testing the exception
  b = Integer.MAX_VALUE;
  c = getAbsAdd(a,b);
  System.out.println("c = " + c);

}


//https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments

public static int getAbsAdd(int x, int y) {
  assert x != Integer.MIN_VALUE;
  assert y != Integer.MIN_VALUE;
  int absX = Math.abs(x);
  int absY = Math.abs(y);
  assert (absX <= Integer.MAX_VALUE - absY);
  return absX + absY;
}

}
