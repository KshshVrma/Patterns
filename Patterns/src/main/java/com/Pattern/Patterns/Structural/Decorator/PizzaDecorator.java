package com.Pattern.Patterns.Structural.Decorator;

public abstract class PizzaDecorator implements Pizza {
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
