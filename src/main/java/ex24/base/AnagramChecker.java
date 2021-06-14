package ex24.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.util.Arrays;

public class AnagramChecker {

    private static String reorder(String string) {
        String str = string.toLowerCase();
        str = str.replaceAll(" ", "");
        char[] characterArray = str.toCharArray();
        Arrays.sort(characterArray);
        return (new String(characterArray));
    }

    public String isAnagram(String string1, String string2) {
        if (reorder(string1).length() != reorder(string2).length()) {
            return String.format("%s and %s are not the same length. They are not anagrams.", string1, string2);
        } else if(reorder(string1).equals(reorder(string2))) {
            return String.format("%s and %s are anagrams.", string1, string2);
        } else {
            return String.format("%s and %s are not anagrams.", string1, string2);
        }
    }
}
