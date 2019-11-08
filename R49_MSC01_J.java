// https://wiki.sei.cmu.edu/confluence/display/java/MSC01-J.+Do+not+use+an+empty+infinite+loop
public static class Rule49MSC01 {
    public int nop() {
        while (true) {}
    }
}