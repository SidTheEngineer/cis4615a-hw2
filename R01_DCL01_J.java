// https://wiki.sei.cmu.edu/confluence/display/java/DCL01-J.+Do+not+reuse+public+identifiers+from+the+Java+Standard+Library
public static class Rule01DCL01 {
    class Vector {
        private int val = 1;
        
        public boolean isEmpty() {
            if (val == 1) {   // Compares with 1 instead of 0
            return true;
            } else {
            return false;
            }
        }
        // Other functionality is same as java.util.Vector
    }
        
        // import java.util.Vector; omitted
    public static class VectorUser {
        public static void main(String[] args) {
            Vector v = new Vector();
            if (v.isEmpty()) {
                System.out.println("Vector is empty");
            }
        }
        }
}