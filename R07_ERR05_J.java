import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// https://wiki.sei.cmu.edu/confluence/display/java/ERR05-J.+Do+not+let+checked+exceptions+escape+from+a+finally+block
public class R07_ERR05_J {
    public static void doOperation(String some_file) {
        // ... Code to check or set character encoding ...
        try {
          BufferedReader reader =
              new BufferedReader(new FileReader(some_file));
          try {
            // Do operations
          } finally {
            try {
              reader.close();
            } catch (IOException ie) {
              // Forward to handler
            }
            // ... Other cleanup code ...
          }
        } catch (IOException x) {
          // Forward to handler
        }
    }

    public static void main(String[] args) {
        doOperation("example_file.txt");
    }
}