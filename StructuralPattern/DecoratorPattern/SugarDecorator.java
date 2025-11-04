package StructuralPattern.DecoratorPattern;

public class SugarDecorator extends Decorator {
    public SugarDecorator(AbstractCofee coffee){
        super(coffee);
    }

    public void get_ingredients() {
        super.get_ingredients();
        System.out.print(" <- Sugar");
    }
    public int get_price() {
        return super.get_price() + 2;
    }
    
}
