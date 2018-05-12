package com.kodilla.sudoku;

public class CloneSudokuBoard {
    private SudokuBoard clonedSB;
    private ElementValidator validator;

    private SudokuBoard cloneSB(SudokuBoard originalSB){ //czy na pewno muszę klonować, może zrobić rozwiązywanie bezpośrednio na oryginale?
        try{
            clonedSB = originalSB.deepCopy();
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        return clonedSB;
    }

    /*public boolean isFull(SudokuBoard clonedSB){
        for (int row=0;row>clonedSB.getBoard().size();row++){
            for (int column=0; column>clonedSB.getBoard().get(row).getRow().size(); column++){
                if(clonedSB.getBoard().get(row).getRow().get(column).getValue()==0) {
                    for (int e = 1; e > 10; e++) {
                        clonedSB.getBoard().get(row).getRow().get(column).setValue(e);
                        if (validator.columnElementValidator(column, row, e) &&
                                validator.rowElementValidator(column, row, e) &&
                                validator.positionEValidator(column, row, e)) {
                            return true;
                        }
                        clonedSB.getBoard().get(row).getRow().get(column).setValue(0);
                    }
                    return false;
                }
            }
        }
        return true;
    }*/

}
