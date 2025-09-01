package com.Pattern.Patterns.Structural.Decorator;

import java.sql.SQLOutput;

public class Tester {
    public static void main(String[] args) {

        Pizza basicPizza=new BasePizza();
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());
        Pizza cheesePizza=new CheesePizza(basicPizza);
        Pizza PannerCheesePizza=new PaneerPizza(cheesePizza);

        System.out.println(PannerCheesePizza.getDescription());
        System.out.println(PannerCheesePizza.getCost());

    }
}
