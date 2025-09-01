package com.Pattern.Patterns.Problems.tictactoe;

import com.Pattern.Patterns.Problems.tictactoe.Entity.Board;
import com.Pattern.Patterns.Problems.tictactoe.Entity.Player;
import com.Pattern.Patterns.Problems.tictactoe.Entity.Symbol;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Tic Tac Toe Game");
        System.out.println("Enter the size of board you want to play");
        int n=sc.nextInt();
        Board board=new Board(n);
        System.out.println("Player 1 Enter the symbol you want to choose X or O");
        char c=sc.next().charAt(0);
        System.out.println("Player 2 Enter the symbol you want to choose X or O");
        char p=sc.next().charAt(0);
        Player p1=new Player(new Symbol(c));
        Player p2=new Player(new Symbol(p));
        int turn=0;
        while(turn<n*n && !board.isGameOver){
            System.out.println(board.printBoard());
            if(turn%2==0){
                System.out.println("Player 1's turn");
                System.out.println("Enter the row and column to place your symbol");
                int row=sc.nextInt();
                int col=sc.nextInt();
                boolean isPlaced=board.placeSymbol(row,col,c);
                if(!isPlaced){
                    System.out.println("Invalid move! Try again.");
                    continue;
                }
            }else{
                System.out.println("Player 2's turn");
                System.out.println("Enter the row and column to place your symbol");
                int row=sc.nextInt();
                int col=sc.nextInt();
                boolean isPlaced=board.placeSymbol(row,col,p);
                if(!isPlaced){
                    System.out.println("Invalid move! Try again.");
                    continue;
                }
            }

            String result=board.checkWinner();
            boolean isGameended=board.isGameOver;
            if(isGameended != false){
                System.out.println(board.printBoard());
                System.out.println(result);
                break;
            }
            else{
                if(turn==n*n-1){
                    System.out.println("Game is a draw");
                }
            }
            turn++;
        }




    }
}
