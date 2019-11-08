// https://wiki.sei.cmu.edu/confluence/display/java/MSC01-J.+Do+not+use+an+empty+infinite+loop
public class R49_MSC01_J {
    public void nop() {
        while (true) {
          Thread.yield();
        }
    }

    public static void main(String[] args) {
        // This compliant solution invokes Thread.yield(), which causes the thread running 
        // this method to consistently defer to other threads
    }
}