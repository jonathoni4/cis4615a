
import java.io.File;
//Jonathon Irigoyen
//Expressions
public class R02_XP00_J {

  public static void main(String[] args) {

    deleteFile();

}
//https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
public static void deleteFile(){

  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
     throw new RuntimeException("Did not delete file.");
  }

}
}
