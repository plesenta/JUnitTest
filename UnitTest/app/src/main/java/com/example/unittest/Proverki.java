package com.example.unittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Proverki {

    public static boolean ProverkaEmailValid(String email){

        Matcher match = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return match.find();

    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);

    public static boolean ProverkaPasswordValid(String passwd){

        boolean Password_valid = false;
        if (passwd.length() >= 7 && passwd.matches(".*[0-9].*") && passwd.matches(".*[a-z].*") &&  passwd.matches(".*[A-Z].*") && passwd.matches(".*[!@#$%<>+_-].*") ) Password_valid = true;
        return Password_valid;

    }
}
