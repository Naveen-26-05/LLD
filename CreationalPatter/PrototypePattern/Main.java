package PrototypePattern;

public class Main {
    public static void main(String[] args) {
        Concrete concrete = new Concrete(1, "Concrete");
        Concrete concreteClone = (Concrete)concrete.clone();
        System.out.println(concreteClone.id);
        System.out.println(concreteClone.name);
        
    }
}
