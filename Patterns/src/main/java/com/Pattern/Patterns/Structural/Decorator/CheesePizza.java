package com.Pattern.Patterns.Structural.Decorator;

public class CheesePizza extends PizzaDecorator{

    CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+",cheese";
    }

    @Override
    public int getCost() {
        return super.getCost() + 1;
    }
}
