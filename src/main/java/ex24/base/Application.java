package ex24.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.util.Arrays;
import java.util.Scanner;


public class Application {
    private AnagramChecker checker;

    public static void main(String[] args) {
        Application app = new Application();

        // get two strings from the user
        System.out.println("Enter two strings and I'll tell you if they are anagrams: \n" +
                "Enter the first string: ");
        String string1 = app.readString();
        System.out.println("Enter the second string: ");
        String string2 = app.readString();

        // check whether it's an anagram or not
        String result = app.isAnagram(string1, string2);

        // print result
        System.out.println(result);

    }

    public Application() {
        this.checker = new AnagramChecker();
    }
    public String readString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public String isAnagram(String string1, String string2) {
        return this.checker.isAnagram(string1, string2);
    }

    public String reorder(String string) {
        String str = string.toLowerCase();
        str = str.replaceAll(" ", "");
        char[] characterArray = str.toCharArray();
        Arrays.sort(characterArray);
        return (new String(characterArray));
    }
}
