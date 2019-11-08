// https://wiki.sei.cmu.edu/confluence/display/java/ERR05-J.+Do+not+let+checked+exceptions+escape+from+a+finally+block
public static class Rule07ERR05 {
    public static class Operation {
        public static void doOperation(String some_file) {
            // ... Code to check or set character encoding ...
            try {
            BufferedReader reader =
                new BufferedReader(new FileReader(some_file));
            try {
                // Do operations
            } finally {
                reader.close();
                // ... Other cleanup code ...
            }
            } catch (IOException x) {
            // Forward to handler
            }
        }
    }
}