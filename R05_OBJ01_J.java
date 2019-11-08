// https://wiki.sei.cmu.edu/confluence/display/java/OBJ01-J.+Limit+accessibility+of+fields
class Widget {
    private int total; // Declared private
   
    public int getTotal () {
      return total;
    }
   
    void add() {
        if (total < Integer.MAX_VALUE) {     
          total++;
          // ...
        } else {
          throw new ArithmeticException("Overflow");
        }
      }
     
    void remove() { 
        if (total > 0) {     
            total--;
            // ...
        } else {
            throw new ArithmeticException("Overflow");
        }
    }
}

public class R05_OBJ01_J {
    public static void main(String[] args) {
        Widget widget = new Widget();

        // Will not work!
        // System.out.println(widget.total);

        System.out.println(widget.getTotal());
    }
}