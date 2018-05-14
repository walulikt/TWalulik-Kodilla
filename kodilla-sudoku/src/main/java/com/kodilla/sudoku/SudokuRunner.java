package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameFinished = false;
        SudokuGame theGame = new SudokuGame();

        System.out.println(SudokuGame.MENU);

        while (!gameFinished){
            theGame.printSudokuBoard();
            System.out.println (SudokuGame.SET_INPUT_INFORMATION);
            String userInput = scanner.nextLine();
            if (userInput.equals("SUDOKU")){
               // long begin = System.currentTimeMillis();
                boolean sudokuSolved = theGame.resolveSudoku(theGame.getSB());
              //  long end = System.currentTimeMillis();
              //  System.out.println("Czas rowiązania sudoku: " + (begin-end) + "ms");
                if(sudokuSolved){
                    theGame.printSudokuBoard();
                    System.out.println ("SUDOKU rozwiązane:). Czy chcesz zagrać jeszcze raz (\"T\" lub \"EXIT\")?");
                    userInput = scanner.nextLine();
                    if(userInput.equals("T")) {
                        theGame = new SudokuGame();
                        continue;
                    }
                }
            } else if (userInput.equals("EXIT")){
                gameFinished=true;
            } else {
                try {
                    theGame.setTheElement(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("Nieprawidłowy format danych! Podaj liczby w formacie '1,3,4' lub napisz SUDOKU, żeby rozwiązać zadanie. Żeby zakończyć grę wpisz EXIT.");
                }
            }
        }

        scanner.close();
    }
}
