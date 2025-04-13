package com.Pattern.Patterns.Structural.Decorator;

public class PizzaDecorator extends BasePizza {
    Pizza pizza;
    PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public int getCost() {
        return pizza.getCost();
    }
}
