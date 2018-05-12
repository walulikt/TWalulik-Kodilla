package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard{
    private SudokuRow sudokuRow;
    private List<SudokuRow> board = new ArrayList<>(9);

    public SudokuBoard() {
        for (int b=0; b<9; b++) {
            getBoard().add(new SudokuRow());
        }
        for (SudokuRow row: getBoard()) {
            for (int b=0; b<9; b++) {
                getBoard().get(b).getRow().add(new SudokuElement());
            }
        }
    }

    public SudokuRow getSudokuRow() {
        return sudokuRow;
    }

    public void setSudokuRow(SudokuRow sudokuRow) {
        this.sudokuRow = sudokuRow;
    }

    public List<SudokuRow> getBoard() {
        return board;
    }

    public void setBoard(List<SudokuRow> board) {
        this.board = board;
    }


    @Override
    public String toString () {
        String stringOfElements="";
        for (int i=0;i<board.size();i++){
            stringOfElements += board.get(i).toString();
        }
        return stringOfElements;
    }
    public SudokuBoard shallowCopy() throws CloneNotSupportedException {
        return (SudokuBoard)super.clone();
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard)super.clone();
        clonedBoard.setBoard(new ArrayList<>());
        for (SudokuRow theRow: clonedBoard.getBoard()) {
            SudokuRow clonedRow = new SudokuRow();
            for (SudokuElement element : theRow.getRow()){
                clonedRow.getRow().add(element);
            }
            clonedBoard.getBoard().add(clonedRow);
        }
        return clonedBoard;
    }
}
