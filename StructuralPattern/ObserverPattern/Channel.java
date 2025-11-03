package StructuralPattern.ObserverPattern;

import java.util.ArrayList;

public class Channel implements Subject {   
    private ArrayList<Observer> subscribers;
    public Channel(){
        subscribers = new ArrayList<>();
    }
    @Override
    public void addSubscriber(Observer subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Observer subscriber){
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers(){
        for(Observer subscriber : subscribers){
            subscriber.listen();
        }
    }
    
}
