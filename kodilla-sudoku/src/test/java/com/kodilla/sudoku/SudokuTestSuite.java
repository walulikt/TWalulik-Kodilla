package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.Iterator;

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
    public void testSudokuElementEquals(){
        //Given
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.createBoard();
        SudokuBoard sudokuBoard = sudokuGame.getsB();

        //When
        sudokuGame.setTheElement("1,2,5");

        boolean checkEquals1 = sudokuGame.checkSudokuElementEquals(1);
       // sudokuGame.setTheElement("2,2,4");
      //  boolean checkEquals2 = sudokuGame.checkSudokuElementEquals(4);

        //Then
        Assert.assertFalse(checkEquals1);
      //  Assert.assertTrue(checkEquals2);
        sudokuGame.printSudokuBoard();

    }

}
