package StructuralPattern.ObserverPattern;

interface Subject {
    public void addSubscriber(Observer subscriber);
    public void removeSubscriber(Observer subscriber);
    public void notifySubscribers();
}
