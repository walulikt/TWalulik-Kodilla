package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {

       /* boolean gameFinished = false;

        while (!gameFinished){
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();

        }*/
        SudokuElement sudokuElement=new SudokuElement();
        sudokuElement.setElementValues();
        System.out.println(sudokuElement.getElementValues());
    }
}
