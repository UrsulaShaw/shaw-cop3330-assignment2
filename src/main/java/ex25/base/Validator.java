package ex25.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ursula Shaw
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public int passwordValidator(String password) {

        int strength = 0;
        if (isLongEnough(password) && hasLetter(password) && hasNumber(password) && hasSpecialChar(password)) {
            strength = 3;
        } else if ((isLongEnough(password) && hasLetter(password) && hasNumber(password)) ||
                (isLongEnough(password) && hasLetter(password) && !hasNumber(password)) ||
                (isLongEnough(password) && hasNumber(password) && !hasLetter(password))) {
            strength = 2;
        } else if (hasLetter(password) && !isLongEnough(password) && !hasNumber(password)) {
            strength = 1;
        } else if (hasNumber(password) && !isLongEnough(password) && !hasLetter(password)) {
            return strength;
        }
        return strength;
    }
    public String displayOutput(String password, int strength) {
        String output = "";
        if (strength == 0) {
            output = String.format("%s is a very weak password.", password);
        } else if (strength == 1) {
            output = String.format("%s is a weak password.", password);
        } else if (strength == 2) {
            output = String.format("%s is a strong password.", password);
        } else if (strength == 3) {
            output = String.format("%s is a very strong password.", password);
        }
        return output;
    }
    public boolean isLongEnough(String password) {
        if (password.length() < 8) {
            return true;
        } else {
            return false;
        }
    }
    public boolean hasLetter(String password) {
        boolean b = false;
        char[] passArray = password.toCharArray();
        for (char c : passArray) {
            if(Character.isLetter(c)) {
                b = true;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    public boolean hasNumber(String password) {
        boolean b = false;
        char[] passArray = password.toCharArray();
        for (char c : passArray) {
            if (Character.isDigit(c)) {
                b = true;
            } else {
                b = false;
            }
        }
        return b;
    }
    public boolean hasSpecialChar(String password) {
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(password);
        boolean b = m.find();
        if (b) {
            return true;
        } else {
            return false;
        }
    }
}
