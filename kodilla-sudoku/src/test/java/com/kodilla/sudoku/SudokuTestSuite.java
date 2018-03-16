package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;


public class SudokuTestSuite {

    @Test
    public void testSudokuBoardToString(){
        //Given
        SudokuBoard sudokuBoard = new SudokuBoard();
        SudokuRow row = new SudokuRow();
        SudokuRow row1 = new SudokuRow();
        SudokuElement e1 = new SudokuElement();
        SudokuElement e2 = new SudokuElement(2);
        SudokuElement e3 = new SudokuElement();
        row.getRow().add(e1);
        row.getRow().add(e2);
        row.getRow().add(e3);
        row1.getRow().add(e1);
        row1.getRow().add(e2);
        row1.getRow().add(e3);

        //When
        sudokuBoard.getBoard().add(row);
        sudokuBoard.getBoard().add(row1);

        //Then
        for (SudokuRow r: sudokuBoard.getBoard())
                System.out.println(r);
        }

    @Test
    public void testSudokuElementSetElementValues(){
        //Given
        SudokuElement sudokuElement=new SudokuElement();
        //When
        sudokuElement.setElementValues();

        //Then
        System.out.print(sudokuElement.getElementValues());

    }
    @Test
    public void testSudokuElementsSetValuesValidator(){
        //Given
        SudokuGame sudokuGame = new SudokuGame();
        ElementValidator eV = new ElementValidator(sudokuGame.getsB());

        //When
        sudokuGame.setTheElement("2,3,4");
        sudokuGame.printSudokuBoard();

       sudokuGame.setTheElement("1,1,4");

        sudokuGame.setTheElement("3,2,4");
        sudokuGame.setTheElement("1,4,4");
        sudokuGame.setTheElement("8,8,4");
        sudokuGame.setTheElement("7,9,4");
        sudokuGame.printSudokuBoard();

        //Then


    }


}
