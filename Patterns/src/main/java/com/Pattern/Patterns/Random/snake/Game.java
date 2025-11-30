package com.Pattern.Patterns.Random.snake;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Game {
    Dice dice;
    Board board;
    Queue<Player> players;
    Player winner;
    ArrayList<Snake> snake;
    ArrayList<Ladder> ladder;
    State state;

    public Game( int bsize,int numplayers, ArrayList<Snake> snake, ArrayList<Ladder> ladder) {
        this.dice = new Dice();
        this.board = new Board(bsize, snake, ladder);
        players=new ArrayDeque<>();
        for(int i=0;i<numplayers;i++){
            players.add(new Player("Player"+(i+1),0));
        }
        this.snake = snake;
        this.ladder = ladder;
        state=State.NOT_STARTED;
    }

    public void Play(){
        state=State.RUNNING;
        while(winner==null){
            Player currentPlayer= players.poll();
            int diceValue=dice.roll();
            int newPosition=currentPlayer.position + diceValue;
            if(newPosition>board.size){
                System.out.println(currentPlayer.name + " rolled a " + diceValue + " and cannot move from position " + currentPlayer.position);
                players.add(currentPlayer);
            }else{
                for(BoardEntity entity: board.entities){
                    if(entity.start==newPosition){

                        newPosition=entity.end;
                        if(newPosition<entity.start){
                            System.out.println(currentPlayer.name + " rolled a " + diceValue + " and moved from position " + currentPlayer.position + " to " + entity.start + " and got bitten by a snake to " + newPosition);
                        }else{
                            System.out.println(currentPlayer.name + " rolled a " + diceValue + " and moved from position " + currentPlayer.position + " to " + entity.start + " and climbed a ladder to " + newPosition);
                        }
                        break;
                    }
                }
                System.out.println(currentPlayer.name + " rolled a " + diceValue + " and moved from position " + currentPlayer.position + " to " + newPosition);
                currentPlayer.position=newPosition;
                if(newPosition==board.size){
                    winner=currentPlayer;
                    state=State.ENDED;
                }else{
                    players.add(currentPlayer);
                }
            }
        }

        System.out.println("Winner is: " + winner.name);
    }

    public State getState() {
        return state;
    }

}
