package StructuralPattern.DecoratorPattern;


// dynmaically add new behavior to an  already created object without modifying the old code 
// 1. pizza the base pizza remains same but we keep adding sauce , topping etc on the top of the pizza
// 2. coffee the base coffee remains same but we keep adding milk , sugar , etc on the top of the coffee the price also changes
public class Main {
    public static void main(String[] args) {
        ConcreteCoffee coffee = new ConcreteCoffee();
        SugarDecorator sugar = new SugarDecorator(coffee);
        FoamDecorator foam = new FoamDecorator(sugar);
        foam.get_ingredients();
        System.out.println(" price : "+foam.get_price());
    }
}
