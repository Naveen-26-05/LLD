package StructuralPattern.ObserverPattern;
public class Main {
    public static void main(String[] args) {
        Channel ch1 = new Channel();
        Watcher w1 = new Watcher();
        Watcher w2 = new Watcher();
        Watcher w3 = new Watcher();
        ch1.addSubscriber(w1);
        ch1.addSubscriber(w2);
        ch1.addSubscriber(w3);
        ch1.notifySubscribers();
        
    }
}
