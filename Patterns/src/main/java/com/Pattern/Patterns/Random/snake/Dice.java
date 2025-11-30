package com.Pattern.Patterns.Random.snake;

public class Dice {
    public int roll() {
        return (int)(Math.random() * 6) + 1;
    }
}
