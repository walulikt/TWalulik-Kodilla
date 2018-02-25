package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false;
        SudokuGame theGame = new SudokuGame();

        System.out.println(SudokuGame.MENU);

        while (!gameFinished){
            theGame.createBoard();
            System.out.println (SudokuGame.SET_INPUT_INFORMATION);
            String userInput = scanner.nextLine();
            if (userInput.equals("SUDOKU")){
                gameFinished = theGame.resolveSudoku();
                theGame.printSudokuBoard();
            } else if (userInput.equals("EXIT")){
                gameFinished=true;
            } else {
                try {
                    theGame.setTheElement(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("Nieprawidłowy format danych! Podaj liczby w formacie '1,3,4' lub napisz SUDOKU, żeby rozwiązać zadanie");
                }
                theGame.printSudokuBoard();
            }
        }

        scanner.close();
    }
}
