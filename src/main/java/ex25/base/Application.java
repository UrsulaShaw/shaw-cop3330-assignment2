package ex25.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.util.Scanner;

public class Application {
    private Validator validator;

    public static void main(String[] args) {
        Application app = new Application();

        Scanner in = new Scanner(System.in);
        // get a string from the user
        String password = in.nextLine();

        // pass through strength indicator
        int strength = app.passwordValidator(password);

        // display output
        System.out.println(app.displayOutput(password, strength));
    }

    public String displayOutput(String password, int strength) {
        return this.validator.displayOutput(password, strength);
    }

    public Application() {
        this.validator = new Validator();
    }
    public int passwordValidator(String password) {
        return this.validator.passwordValidator(password);
    }
}
