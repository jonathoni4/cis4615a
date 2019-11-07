


public class R07_ERR04_J {

  public static void main(String[] args) {

    doLogic();
  }
  private static boolean doLogic() {
  try {
    throw new IllegalStateException();
  } finally {
    System.out.println("logic done");
  }
}
}
