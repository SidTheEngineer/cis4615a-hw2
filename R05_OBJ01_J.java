// https://wiki.sei.cmu.edu/confluence/display/java/OBJ01-J.+Limit+accessibility+of+fields
public static class Rule05OBJ01 {
    public static class Widget {
        public int total; // Number of elements

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
}