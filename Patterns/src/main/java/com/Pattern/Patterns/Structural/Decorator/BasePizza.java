package com.Pattern.Patterns.Structural.Decorator;

public class BasePizza implements Pizza {
    @Override
    public String getDescription() {
        return "base ";
    }

    @Override
    public int getCost() {
        return 5;
    }
}
