package com.company;

import java.util.ArrayList;

//Tic Tac Toe game by Michael Bila

public class Main {
    //private ArrayList<Integer> gameBoard;
    private int[][] gameBoard;
    private int xCoordinate;
    private int yCoordinate;
    private int whosTurn;

    public void main() {
        gameBoard = new int[3][3];
    }

    public void fillArray() {
        final int BOARD_SIZE = 3;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                gameBoard[i][j] = Enum.valueOf("EMPTY").getValue();
            }
        }
    }

    public void makeMove(int xCoordinate, int yCoordinate) {
        gameBoard[xCoordinate][yCoordinate] = Enum.valueOf(whosTurn + "").getValue();
        if (whosTurn == 0) {
            whosTurn = 1;
        } else {
            whosTurn = 0;
        }
    }

    public void checkVictory() {
        for (int i = 0; i < 3; i++) {
            if (gameBoard[i][0] & gameBoard[i][1] & gameBoard[i][1] == (Enum.getValue())) {
                System.out.println(Enum.getValue() + "Wins!");
            } else {
                for (int j = 0; j < 3; j++) {
                    if (gameBoard[0][j] & gameBoard[1][j] & gameBoard[2][j] == (Enum.getValue())) {
                        System.out.println(Enum.getValue() + "Wins!");
                    }
                }
            }
        }
    }
}
