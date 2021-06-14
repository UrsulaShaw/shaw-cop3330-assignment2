package ex26.base;

public class PaymentCalculator {

    public int calculateMonthsUntilPaidOff(double balance, double apr, double monthly) {
        apr = apr / 100;
        return (int) Math.ceil((-(1.0/30.0) * (Math.log(1 + balance/monthly * (1 - Math.pow(1 + (apr/365), 30))) / Math.log(1 + (apr/365)))));

    }
}

