package com.Pattern.Patterns.Random.snake;

import java.util.ArrayList;

public class Client {

    Game game;
    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game");
        ArrayList<Snake> snakes=new ArrayList<>();
        ArrayList<Ladder> ladders=new ArrayList<>();
        snakes.add(new Snake(17,4));
        snakes.add(new Snake(14,7));
        snakes.add(new Snake(57,34));
        snakes.add(new Snake(44,17));
        ladders.add(new Ladder(3,22));
        ladders.add(new Ladder(5,8));
        ladders.add(new Ladder(32,62));
        ladders.add(new Ladder(51,89));
        Game game=new Game(100,3, snakes, ladders);
        game.Play();




    }
}
