package com.Pattern.Patterns.Structural.Decorator;

public class PaneerPizza extends PizzaDecorator{

    PaneerPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Paneer";
    }

    @Override
    public int getCost() {
        return super.getCost()+4;
    }
}
