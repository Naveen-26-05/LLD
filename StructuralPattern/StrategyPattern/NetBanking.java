package StructuralPattern.StrategyPattern;

public class NetBanking implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Net Banking");
    }
    
}
