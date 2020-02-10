package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] sodokuGrid = {
                { 0, 0, 0, 0, 0, 2, 1, 0, 0 },
                { 0, 0, 4, 0, 0, 8, 7, 0, 0 },
                { 0, 2, 0, 3, 0, 0, 9, 0, 0 },
                { 6, 0, 2, 0, 0, 3, 0, 4, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 5, 0, 6, 0, 0, 3, 0, 1 },
                { 0, 0, 3, 0, 0, 5, 0, 8, 0 },
                { 0, 0, 8, 2, 0, 0, 5, 0, 0 },
                { 0, 0, 9, 7, 0, 0, 0, 0, 0 }
        };

        SodokuBoard sodokuBoard = new SodokuBoard(sodokuGrid);

        if(sodokuBoard.solve()) sodokuBoard.displayValidBoard();

    }
}
