package StructuralPattern.StrategyPattern;
// dynamically change the behavior of a single object at runtime , unlike facade pattern which is used to simplify the interface of a complex system
public class Main {
    public static void main(String[] args){
        Payment payment = new Paypal();
        PaymentStrategy paymentStrategy = new PaymentStrategy(payment);
        paymentStrategy.pay(100);
        payment = new NetBanking();
        paymentStrategy = new PaymentStrategy(payment);
        paymentStrategy.pay(100);
    }
}
