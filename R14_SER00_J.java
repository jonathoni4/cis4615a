//Jonaton Irigoyen
//Serialization
//https://wiki.sei.cmu.edu/confluence/display/java/SER00-J.+Enable+serialization+compatibility+during+class+evolution
public class R14_SER00_J {

  private static final long serialVersionUID = 24L;

  int numOfWeapons = 10;

  public String toString() {
    return String.valueOf(numOfWeapons);
  }

  public static void main(String[] args) {

  }
}
