package com.kodilla.sudoku;


public class SudokuGame {

    public static final String MENU = "Witam. Gra polega na wstawieniu do Sudoku wybranych przez siebie liczb i umożliwieniu rozwiązania całej łąmigłówki programowi poprzez wpisanie komendy SUDOKU."+ '\n' +
            " Przyklad: '1,2,7' - oznacza, ze w kolumnie 1, wierszu 2 ma zostac wprowadzona liczba 7. Pamiętaj o wpisaniu ','." + '\n' +
            "Jak już wprowadzisz wszystkie liczby wpisz słowo 'SUDOKU' a program zajmie się resztą :)." + '\n' +
            "W celu zakończenia gry wpisz 'EXIT'"+'\n'+"Zaczynamy!";
    public static final String SET_INPUT_INFORMATION="Wybierz nr kolumny, nr wiersz i wartosc pola, albo napis SUDOKU aby rozwiązać";
    private SudokuBoard sB = new SudokuBoard();
    private ElementValidator elementValidator=new ElementValidator(sB);
    private int columnIndex;
    private int rowIndex;
    private int elementValue;

    public ElementValidator getElementValidator() {
        return elementValidator;
    }

    public SudokuBoard getSB() {
        return sB;
    }

    public boolean setTheElement(String userInput) throws NumberFormatException{
        boolean isSet = true;
        String[] elementData = userInput.split(",");
        columnIndex = Integer.parseInt(elementData[0])-1;
        rowIndex = Integer.parseInt(elementData[1])-1;
        elementValue = Integer.parseInt(elementData[2]);
        if(elementValidator.userInputCheck(columnIndex, rowIndex,elementValue)) {
            if ((elementValidator.columnElementValidator(columnIndex, rowIndex, elementValue)) &&
                    (elementValidator.rowElementValidator(columnIndex, rowIndex, elementValue)) &&
                    (elementValidator.positionEValidator(columnIndex, rowIndex, elementValue))) {
                sB.getBoard().get(rowIndex).getRow().get(columnIndex).setValue(elementValue);
                System.out.println("Dane wprowadzono");
                isSet=true;
            } else {
                System.out.println("Nie można wprowadzić wartości: " + (elementValue) + " w polu: kolumna: " + (columnIndex + 1) + ", wiersz: " + (rowIndex + 1));
                isSet=false;
            }
        }
        return isSet;
    }

    public void printSudokuBoard (){
        for (SudokuRow r: sB.getBoard())
            System.out.println(r);
    }

    public boolean resolveSudoku(SudokuBoard sB) {
        for (int row=1;row<10;row++){
            for (int column=1; column<10; column++){
                if(sB.getBoard().get(row-1).getRow().get(column-1).getValue()==0) {
                    for (int e = 1; e < 10; e++) {
                        String checkPositionValue = column+","+row+","+e;

                        if (setTheElement(checkPositionValue)&&
                                resolveSudoku(sB)) {
                            sB.getBoard().get(row-1).getRow().get(column-1).setValue(e);
                            return true;
                        }
                        sB.getBoard().get(row-1).getRow().get(column-1).setValue(0);
                     //   System.out.println("wartość "+ sB.getBoard().get(row).getRow().get(column)+" wyzerowana");
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
