package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private SudokuRow sudokuRow;
    private List<SudokuRow> board = new ArrayList<>();

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
}
