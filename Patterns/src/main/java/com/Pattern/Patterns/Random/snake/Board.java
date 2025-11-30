package com.Pattern.Patterns.Random.snake;

import java.util.ArrayList;

public class Board {
    int size;
    ArrayList<BoardEntity> entities;
    public Board(int size, ArrayList<Snake> snakes, ArrayList<Ladder> ladders) {
        entities=new ArrayList<>();
        this.size = size;
       for(Snake snake: snakes){
           entities.add(snake);
       }
       for(Ladder ladder: ladders){
           entities.add(ladder);
       }
    }

}
