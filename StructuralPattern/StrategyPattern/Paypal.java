package StructuralPattern.StrategyPattern;

public class Paypal implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Payapl");
    }
}
