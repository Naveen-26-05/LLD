package StructuralPattern.DecoratorPattern;

public class FoamDecorator extends Decorator {
    public FoamDecorator(AbstractCofee coffee){
        super(coffee);
    }
    public void get_ingredients() {
        super.get_ingredients();
        System.out.print(" <- Foam");
    }
    public int get_price() {
        return super.get_price() + 5;
    }
    
}
