package com.kodilla.sudoku;

public class ElementValidator {

    private SudokuBoard sudokuBoard;

    public ElementValidator(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public boolean rowElementValidator(int columnNumber, int rowNumber, int elementValue){
        boolean elementValueChecked=false;
        for (int rowIndex=0 ; rowIndex<sudokuBoard.getBoard().size(); rowIndex++)
            if (sudokuBoard.getBoard().get(rowIndex).getRow().get(columnNumber).getValue()==elementValue) { //sprawdzanie w każdym wierszu dla danej wartości
                System.out.println("Niedozwolona wartość (" + elementValue + ") dla pozycji kolumna: " + (columnNumber+1) + ", wiersz: " + (rowNumber+1) + '\n'
                        + "Taka wartość występuje już w tej kolumnie. Wprowadź dane jeszcze raz!");
                elementValueChecked = false;
                break;
            } else {
            elementValueChecked=true;
            }
        return elementValueChecked;
    }

    public boolean columnElementValidator(int columnNumber, int rowNumber, int elementValue){
        boolean elementValueChecked=false;
        for (int i=0;i<sudokuBoard.getBoard().size();i++){
            if (sudokuBoard.getBoard().get(rowNumber).getRow().get(i).getValue()==elementValue){        //sprawdzanie w danym wierszu dla danej wartości
                System.out.println("Niedozwolona wartość (" + elementValue + ") dla pozycji kolumna: " + (columnNumber+1) + ", wiersz: " + (rowNumber+1) + '\n'
                        + "Taka wartość występuje już w tym wierszu. Wprowadź dane jeszcze raz!");
                elementValueChecked = false;
                break;
            } else {
                elementValueChecked=true; }
        }
        return elementValueChecked;
    }

    public boolean positionEValidator(int columnNumber, int rowNumber, int elementValue){
        boolean elementValueChecked=false;
        int horizontalSquerNr = columnNumber/3;
        int verticalSquerNr = rowNumber/3;
        if((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==0) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==3) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==6) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==0)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==3) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==6)){
            for (int r = rowNumber+1; r<(rowNumber+3); r++){
                if (sudokuBoard.getBoard().get(r).getRow().get(columnNumber+1).getValue()==elementValue){
                    elementValueChecked = false;
                    break;
                }else if (sudokuBoard.getBoard().get(r).getRow().get(columnNumber+2).getValue()==elementValue) {
                    elementValueChecked = false;
                    break;
                }else {
                    elementValueChecked=true;
                }
            }
        } else if ((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==1) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==4) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==7) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==1)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==4) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==7) ) {
            for(int r = rowNumber-1; r<(rowNumber+2); r+=2) {
                if (sudokuBoard.getBoard().get(r).getRow().get(columnNumber-1).getValue()==elementValue){
                    elementValueChecked = false;
                    break;
                }else if (sudokuBoard.getBoard().get(r).getRow().get(columnNumber+1).getValue()==elementValue) {
                    elementValueChecked = false;
                    break;
                }else {
                    elementValueChecked=true;
                }
            }
        } else if ((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==2) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==5) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==8) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==2)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==5) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==8)) {
            for(int r = rowNumber-2; r<rowNumber; r++) {
                if (sudokuBoard.getBoard().get(r).getRow().get(columnNumber-2).getValue()==elementValue){
                    elementValueChecked = false;
                    break;
                }else if (sudokuBoard.getBoard().get(r).getRow().get(columnNumber-1).getValue()==elementValue) {
                    elementValueChecked = false;
                    break;
                }else {
                    elementValueChecked=true;
                }
            }
        } else if((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==0) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==3) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==6) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==1)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==4) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==7) ){
            //sprawdzenie wartości (contains) dla danej wartości elementu w porównaniu do wierszów o indeksie +1 i -1 oraz indeksach elementów  +1 i +2 od danego
            elementValueChecked=false;
        } else if ((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==0) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==3) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+0))==6) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==2)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==5) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==8)){
            //sprawdzenie wartości (contains) dla danej wartości elementu w porównaniu do wierszów o indeksie -1 i -2 oraz indeksach elementów  +1 i +2 od danego
            elementValueChecked=false;
        } else if ((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==1) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==4) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==7) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==0)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==3) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==6)) {
            //sprawdzenie wartości (contains) dla danej wartości elementu w porównaniu do wierszów o indeksie +1 i +2 oraz indeksach elementów  -1 i +1 od danego
            elementValueChecked=false;
        } else if ((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==1) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==4) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+1))==7) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==2)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==5) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+2))==8)){
            //sprawdzenie wartości (contains) dla danej wartości elementu w porównaniu do wierszów o indeksie +1 i -1 oraz indeksach elementów  -1 i +1 od danego
            elementValueChecked=false;
        } else if ((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==2) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==5) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==8) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==0)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==3) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+0))==6)){
            //sprawdzenie wartości (contains) dla danej wartości elementu w porównaniu do wierszów o indeksie +1 i +2 oraz indeksach elementów  -1 i -2 od danego
            elementValueChecked=false;
        } else if ((sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==2) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==5) ||
                (sudokuBoard.getBoard().get(rowNumber).getRow().indexOf(sudokuBoard.getBoard().get(rowNumber).getRow().get(horizontalSquerNr*3+2))==8) &&
                        (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==1)||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==4) ||
                (sudokuBoard.getBoard().indexOf(sudokuBoard.getBoard().get(verticalSquerNr*3+1))==7)) {
            //sprawdzenie wartości (contains) dla danej wartości elementu w porównaniu do wierszów o indeksie +1 i -1 oraz indeksach elementów  -1 i -2 od danego
            elementValueChecked=false;
        }
     return elementValueChecked;
    }

}
