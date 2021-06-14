package ex24.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.util.Arrays;
import java.util.Scanner;


public class Application {
    public static void main(String[] args) {

        // get two strings from the user
        System.out.println("Enter two strings and I'll tell you if they are anagrams: \n" +
                "Enter the first string: ");
        String string1 = readString();
        System.out.println("Enter the second string: ");
        String string2 = readString();

        // check whether it's an anagram or not
        String result = isAnagram(string1, string2);

        // print result
        System.out.println(result);

    }

    private static String readString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static String isAnagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return String.format("%s and %s are not the same length. They are not anagrams.", string1, string2);
        } else if(alphabetize(string1).equals(alphabetize(string2))) {
            return String.format("%s and %s are anagrams.", string1, string2);
        } else {
            return String.format("%s and %s are not anagrams.", string1, string2);
        }
    }

    private static String alphabetize(String string) {
        String str = string.toLowerCase();
        char[] characterArray = str.toCharArray();
        Arrays.sort(characterArray);
        return (new String(characterArray));
    }
}
