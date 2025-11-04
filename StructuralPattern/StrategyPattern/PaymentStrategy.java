package StructuralPattern.StrategyPattern;

public class PaymentStrategy {
    private Payment payment;
    public PaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public void pay(int amount){
        payment.pay(amount);
    }
}
