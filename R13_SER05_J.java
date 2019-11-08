// https://wiki.sei.cmu.edu/confluence/display/java/SER05-J.+Do+not+serialize+instances+of+inner+classes
public static class Rule13SER05 {
    public class OuterSer implements Serializable {
        private int rank;
        class InnerSer implements Serializable {
        protected String name;
        // ...
        }
    }
}