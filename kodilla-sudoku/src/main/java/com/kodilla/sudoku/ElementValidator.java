package com.kodilla.sudoku;

import java.util.stream.Collectors;

public class ElementValidator {

    private SudokuBoard sudokuBoard;

    public ElementValidator(SudokuBoard sudokuBoard) {
        this.sudokuBoard=sudokuBoard;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public boolean columnElementValidator(int columnNumber, int rowNumber, int elementValue){
        boolean elementValueChecked=false;
        for (int rowIndex=0 ; rowIndex<9; rowIndex++)
            if (sudokuBoard.getBoard().get(rowIndex).getRow().get(columnNumber).getValue()==elementValue) {
                System.out.println("Niedozwolona wartość (" + elementValue + ") dla pozycji kolumna: " + (columnNumber+1) + ", wiersz: " + (rowNumber+1) + '\n'
                        + "Taka wartość występuje już w tej kolumnie. Wprowadź dane jeszcze raz!");
                elementValueChecked=false;
                break;
            } else { elementValueChecked=true; }
        return elementValueChecked;
    }

    public boolean rowElementValidator(int columnNumber, int rowNumber, int elementValue){
        boolean elementValueChecked= false;
        SudokuRow sudokuRow = sudokuBoard.getBoard().get(rowNumber);
        if(sudokuRow.getRow().stream().map(sE->sE.getValue()).collect(Collectors.toList()).contains(elementValue)){
            System.out.println("Niedozwolona wartość (" + elementValue + ") dla pozycji kolumna: " + (columnNumber+1) + ", wiersz: " + (rowNumber+1) + '\n'
                    + "Taka wartość występuje już w tym wierszu. Wprowadź dane jeszcze raz!");
            elementValueChecked=false;
        } else { elementValueChecked=true; }
        return elementValueChecked;
    }

    public boolean checkColumnsInSquere(int rowToCheck, int columnToCheck, int elemntValue){
        boolean valueChecked;
        if (sudokuBoard.getBoard().get(rowToCheck).getRow().get(columnToCheck).getValue()==elemntValue){
            return valueChecked=true;
        } else {
            return valueChecked = false;
        }
    }

    public boolean positionEValidator(int columnNrOfTheElement, int rowNrOfTheElement, int elementValue){
        boolean elementValueChecked=true;

        if ((columnNrOfTheElement==0 || columnNrOfTheElement==3 || columnNrOfTheElement==6) &&
                (rowNrOfTheElement==0||rowNrOfTheElement==3 ||rowNrOfTheElement==6)){
            for (int r = rowNrOfTheElement+1; r<(rowNrOfTheElement+3); r++){
                if (checkColumnsInSquere(r,(columnNrOfTheElement+1),elementValue)||
                        checkColumnsInSquere(r,(columnNrOfTheElement+2),elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((columnNrOfTheElement==1 || columnNrOfTheElement==4 || columnNrOfTheElement==7) &&
                (rowNrOfTheElement==1|| rowNrOfTheElement==4 || rowNrOfTheElement==7)){
            for(int r = rowNrOfTheElement-1; r<(rowNrOfTheElement+2); r+=2) {
                if (checkColumnsInSquere(r,columnNrOfTheElement-1,elementValue)||
                        checkColumnsInSquere(r,columnNrOfTheElement+1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((columnNrOfTheElement==2 ||columnNrOfTheElement==5 ||columnNrOfTheElement==8) &&
                (rowNrOfTheElement==2||rowNrOfTheElement==5 ||rowNrOfTheElement==8)){
            for(int r = rowNrOfTheElement-2; r<rowNrOfTheElement; r++) {
                if (checkColumnsInSquere(r,columnNrOfTheElement-2,elementValue)||
                        checkColumnsInSquere(r,columnNrOfTheElement-1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if((columnNrOfTheElement==0 ||columnNrOfTheElement==3 ||columnNrOfTheElement==6 &&
                rowNrOfTheElement==1||rowNrOfTheElement==4 ||rowNrOfTheElement==7)) {
            for(int r = rowNrOfTheElement-1; r<rowNrOfTheElement+2; r+=2) {
                if (checkColumnsInSquere(r,columnNrOfTheElement+1,elementValue)||
                        checkColumnsInSquere(r,columnNrOfTheElement+2,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((columnNrOfTheElement==0 ||columnNrOfTheElement==3 ||columnNrOfTheElement==6) &&
                (rowNrOfTheElement==2||rowNrOfTheElement==5 ||rowNrOfTheElement==8)){
            for(int r = rowNrOfTheElement-2; r<rowNrOfTheElement; r++) {
                if (checkColumnsInSquere(r,columnNrOfTheElement+1,elementValue)||
                        checkColumnsInSquere(r,columnNrOfTheElement+2,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((columnNrOfTheElement==1 ||columnNrOfTheElement==4 ||columnNrOfTheElement==7) &&
                (rowNrOfTheElement==0||rowNrOfTheElement==3 ||rowNrOfTheElement==6)) {
            for(int r = rowNrOfTheElement+1; r<rowNrOfTheElement+3; r++) {
                if (checkColumnsInSquere(r,columnNrOfTheElement-1,elementValue)||
                        checkColumnsInSquere(r,columnNrOfTheElement+1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((columnNrOfTheElement==1 ||columnNrOfTheElement==4 ||columnNrOfTheElement==7) &&
                (rowNrOfTheElement==2||rowNrOfTheElement==5 ||rowNrOfTheElement==8)){
            for(int r = rowNrOfTheElement-2; r<rowNrOfTheElement; r++) {
                if (checkColumnsInSquere(r,columnNrOfTheElement-1,elementValue)||
                        checkColumnsInSquere(r,columnNrOfTheElement+1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((columnNrOfTheElement==2 || columnNrOfTheElement==5 ||columnNrOfTheElement==8) &&
                (rowNrOfTheElement==0||rowNrOfTheElement==3 ||rowNrOfTheElement==6)){
            for(int r = rowNrOfTheElement+1; r<rowNrOfTheElement+3; r++) {
                if (checkColumnsInSquere(r,columnNrOfTheElement-2,elementValue)||
                        checkColumnsInSquere(r,columnNrOfTheElement-1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        } else if ((columnNrOfTheElement==2 ||columnNrOfTheElement==5 ||columnNrOfTheElement==8) &&
                (rowNrOfTheElement==1||rowNrOfTheElement==4 ||rowNrOfTheElement==7)) {
            for(int r = rowNrOfTheElement-1; r<rowNrOfTheElement+2; r+=2) {
                if (checkColumnsInSquere(r,columnNrOfTheElement-2,elementValue) ||
                checkColumnsInSquere(r,columnNrOfTheElement-1,elementValue)){
                    return elementValueChecked = false;
                }
            }
        }
    return elementValueChecked;
    }
}
