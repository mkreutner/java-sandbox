package org.mkdevs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {

    public  static final String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";

    /**
     * Check if the email is valid
     * @param email
     * @return true if the email is valid, false otherwise
     */
    public static boolean isValidEmail(String email) {
        if (email == null)
            return false;
        
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(email);
        
        return emailMatcher.matches();
    }
}
