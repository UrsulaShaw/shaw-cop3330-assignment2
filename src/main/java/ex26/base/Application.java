package ex26.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ursula Shaw
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Application {
    private PaymentCalculator paymentCalculator;

    public static void main(String[] args) {
        Application app = new Application();
        Scanner in = new Scanner(System.in);

        // get info from user
        double balance = getBalance();
        double apr = getAPR() / 100;
        double monthly = getMonthly();
        // calculate
        int months = (int) app.calculateMonthsUntilPaidOff(balance, apr, monthly);

        // print output
        System.out.println(displayResult(months));

    }
    public Application() {
        this.paymentCalculator = new PaymentCalculator();
    }
    public static double getBalance() {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your balance? ");
        return in.nextDouble();
    }
    public static double getAPR() {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the APR on the card (as a percent? ");
        return in.nextDouble();
    }
    public static double getMonthly() {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the monthly payment you can make? ");
        return in.nextDouble();
    }
    public double calculateMonthsUntilPaidOff(double balance, double apr, double monthly) {
        return this.paymentCalculator.calculateMonthsUntilPaidOff(balance, apr, monthly);

    }
    public static String displayResult(int months) {
        return String.format("It will take you %d months to pay off this card.", months);
    }
}
