public static class Rule00IDS03 {
    Logger logger = Logger.getLogger(Rule00IDS.class.getName());
    boolean loginSuccessful = true;
    String username = "this is my username 1234";
    public void inputValidationAndSanitization() {
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}