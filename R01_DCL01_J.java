// https://wiki.sei.cmu.edu/confluence/display/java/DCL01-J.+Do+not+reuse+public+identifiers+from+the+Java+Standard+Library
class MyVector {
    private String test;
    
    public MyVector(String test) {
        this.test = test;
    }

    public String getTest() {
        return this.test;
    }
}

public class R01_DCL01_J {
    public static void main(String[] args) {
        MyVector vector = new MyVector("Hello, World!");
        System.out.println(vector.getTest());
    }
}