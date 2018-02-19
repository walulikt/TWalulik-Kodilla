package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;
    private int value = EMPTY;
    List<Integer> elementPossibleValues=new ArrayList<>(9);

    public SudokuElement(int value) {
        this.value = value;
    }

    public SudokuElement() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getElementValues() {
        return elementPossibleValues;
    }

    public void setElementValues() {
        for (int i = 1; i<10; i++){
         elementPossibleValues.add((i));
        }
    }

    @Override
    public String toString() {
        if (value==EMPTY){
            return "| - |";
        } else {
            return "| "+value+" | " ;
        }
    }
}
