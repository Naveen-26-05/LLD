package StructuralPattern.DecoratorPattern;

public class Decorator implements AbstractCofee {
    protected AbstractCofee coffee;
    public Decorator(AbstractCofee coffee){
        this.coffee = coffee;
    }
    @Override
    public void get_ingredients() {
        coffee.get_ingredients();
    }
    @Override
    public int get_price() {
        return coffee.get_price();
    }
    
}
