package com.Pattern.Patterns.Structural.Decorator;

import java.sql.SQLOutput;

public class Tester {
    public static void main(String[] args) {
        Pizza pizza=new BasePizza();
        PizzaDecorator decorator=new PizzaDecorator(pizza);
        System.out.println(decorator.getDescription());
        System.out.println(decorator.getCost());
        PizzaDecorator cheesePizza=new CheesePizza(decorator);
        PizzaDecorator PannerCheesePizza=new PaneerPizza(cheesePizza);

        System.out.println(PannerCheesePizza.getDescription());
        System.out.println(PannerCheesePizza.getCost());

    }
}
