import java.io.Serializable;

// https://wiki.sei.cmu.edu/confluence/display/java/SER05-J.+Do+not+serialize+instances+of+inner+classes
public class R13_SER05_J {
    public static class OuterSer implements Serializable {
        private int rank;
        static class InnerSer implements Serializable {
          protected String name;
          // ...
        }
    }

    public static void main(String[] args) {
        // Both inner and outer classes are serialized appropriately.
    }
}