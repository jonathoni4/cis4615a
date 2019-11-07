import java.io.*;

public class R13_FIO01_J {

  public static char getChar() throws EOFException, IOException {
  BufferedInputStream in = new BufferedInputStream(System.in); // Wrapper
  int input = in.read();
  if (input == -1) {
    throw new EOFException();
  }
  // Down casting is permitted because InputStream guarantees read() in range
  // 0..255 if it is not -1
  return (char) input;
}

public static void main(String[] args) {
  try {
    // Either redirect input from the console or use
    // System.setIn(new FileInputStream("input.dat"));
    System.out.print("Enter first initial: ");
    char first = getChar();
    System.out.println("Your first initial is " + first);
    System.out.print("Enter last initial: ");
    char last = getChar();
    System.out.println("Your last initial is " + last);
  } catch (EOFException e) {
    System.err.println("ERROR");
    // Forward to handler
  } catch (IOException e) {
    System.err.println("ERROR");
    // Forward to handler
  }
}
}
