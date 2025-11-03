package StructuralPattern.ObserverPattern;

public class Watcher implements Observer{
    public Watcher(){}
    @Override
    public void listen(){
        System.out.println("New video uploaded");     
    }
    
}
