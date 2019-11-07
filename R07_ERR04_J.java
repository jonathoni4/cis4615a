//Jonathon Irigoyen
//Exceptional Behavior
//https://wiki.sei.cmu.edu/confluence/display/java/ERR04-J.+Do+not+complete+abruptly+from+a+finally+block


public class R07_ERR04_J {

  public static void main(String[] args) {

    doLogic();
  }
  private static boolean doLogic() {
      try {
        throw new IllegalStateException();
      } finally {
        System.out.println("logic done");
        return true;
      }
    }
}
