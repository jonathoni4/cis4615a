//Jonaton Irigoyen
//Serialization
//https://wiki.sei.cmu.edu/confluence/display/java/SER00-J.+Enable+serialization+compatibility+during+class+evolution
public class R14_SER00_J {

  int numOfWeapons = 10;


  public String toString() {
    int numOfWeapons = 10;
    return String.valueOf(numOfWeapons);
  }

  public static void main(String[] args) {

  }
}
