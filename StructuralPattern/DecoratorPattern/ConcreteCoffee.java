package StructuralPattern.DecoratorPattern;

public class ConcreteCoffee implements AbstractCofee {
    @Override
    public void get_ingredients() {
        System.out.print("Coffee - Milk");
    }
    @Override
    public int get_price() {
        return 10;
    }
}
