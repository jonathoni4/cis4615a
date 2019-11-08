

//Jonathon Irigoyen
//Numeric Types and Operations
// https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data

import java.io.IOException;
import java.io.*;

//couldnt figure out how to get it to work because of needed input files
public class R03_NUM03_J {

  public static void main(String[] args) {

  }

  public static int getInteger(DataInputStream is) throws IOException {
    return is.readInt();
}
}
