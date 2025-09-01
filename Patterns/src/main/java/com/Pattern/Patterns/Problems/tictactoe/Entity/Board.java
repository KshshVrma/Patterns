package com.Pattern.Patterns.Problems.tictactoe.Entity;

public class Board {
    private char[][] board;
    private int size;
    public boolean isGameOver = false;

    public Board(int size) {
        this.size = size;
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public boolean placeSymbol(int row, int col, char symbol) {
        if (row < 0 || row >= size || col < 0 || col >= size || board[row][col] != '-') {
            return false;
        }
        board[row][col] = symbol;
        return true;
    }

    public char[][] getBoard() {
        return board;
    }

    public int getSize() {
        return size;
    }
    public String printBoard() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sb.append(board[i][j]).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public String checkWinner(){
        for(int i=0;i<size;i++){
            if(board[i][0] != '-' && allEqual(board[i])){
                isGameOver=true;
                return board[i][0] + " wins!";
            }
        }
        for(int j=0;j<size;j++){
            char first = board[0][j];
            if(first != '-'){
                boolean allEqual = true;
                for(int i=1;i<size;i++){
                    if(board[i][j] != first){
                        allEqual = false;
                        break;
                    }
                }
                if(allEqual){
                    isGameOver=true;
                    return first + " wins!";
                }
            }
        }
        char firstDiagonal = board[0][0];
        if(firstDiagonal != '-'){
            boolean allEqual = true;
            for(int i=1;i<size;i++){
                if(board[i][i] != firstDiagonal){
                    allEqual = false;
                    break;
                }
            }
            if(allEqual){
                isGameOver=true;
                return firstDiagonal + " wins!";
            }
        }
        char secondDiagonal = board[0][size-1];
        if(secondDiagonal != '-'){
            boolean allEqual = true;
            for(int i=1;i<size;i++){
                if(board[i][size-1-i] != secondDiagonal){
                    allEqual = false;
                    break;
                }
            }
            if(allEqual){
                isGameOver=true;
                return secondDiagonal + " wins!";
            }
        }
        return "the game goes on";

    }
    private boolean allEqual(char[] row) {
        char first = row[0];
        for(char c : row){
            if(c != first) return false;
        }
        return true;
    }

}
