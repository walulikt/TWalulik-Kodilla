package com.kodilla.sudoku;


public class SudokuGame {

    public static final String MENU = "Witam. Gra polega na wstawieniu do Sudoku wybranych przez siebie liczb i umożliwieniu rozwiązania całej łąmigłówki programowi poprzez wpisanie komendy SUDOKU."+ '\n' +
            " Przyklad: '1,2,7' - oznacza, ze w kolumnie 1, wierszu 2 ma zostac wprowadzona liczba 7. Pamiętaj o wpisaniu ','." + '\n' +
            "Jak już wprowadzisz wszystkie liczby wpisz słowo 'SUDOKU' a program zajmie się resztą :)." + '\n' +
            "W celu zakończenia gry wpisz 'EXIT'"+'\n'+"Zaczynamy!";
    public static final String SET_INPUT_INFORMATION="Wybierz nr kolumny, nr wiersz i wartosc pola, albo napis SUDOKU aby rozwiązać";
    private SudokuBoard sB = new SudokuBoard();
    private ElementValidator elementValidator=new ElementValidator(sB);
    private int columnNumber;
    private int rowNumber;
    private int elementValue;

    public ElementValidator getElementValidator() {
        return elementValidator;
    }

    public SudokuBoard getsB() {
        return sB;
    }

    public void setTheElement(String userInput) throws NumberFormatException{
        String[] elementData = userInput.split(",");
        columnNumber = Integer.parseInt(elementData[0])-1;
        rowNumber= Integer.parseInt(elementData[1])-1;
        elementValue = Integer.parseInt(elementData[2]);

        if((elementValidator.columnElementValidator(columnNumber,rowNumber,elementValue))&&
                (elementValidator.rowElementValidator(columnNumber,rowNumber,elementValue))&&
                (elementValidator.positionEValidator(columnNumber,rowNumber, elementValue))){
            sB.getBoard().get(rowNumber).getRow().get(columnNumber).setValue(elementValue);
            System.out.println ("Dane wprowadzono");
        } else {
            System.out.println("Nie można wprowadzić wartości: " + (elementValue)+ " w polu: kolumna: "+(columnNumber+1)+", wiersz: "+(rowNumber+1));
        }
    }

    public void printSudokuBoard (){
        for (SudokuRow r: sB.getBoard())
            System.out.println(r);
    }

    public boolean resolveSudoku() {
        /*Tworzę klona utworzonej tablicy i sprawdzam każde pole po kolei poprzez iterowanie po wszystkich elementach każdego wiersza. Jeśli .get(dane pole) jest różne od (-1)
        to pętla sprawdzająca czy liczby 1-9 spełniają warunki ElementValidator. Jeśli tak to od razu wstawiamy w klonie*/

        String scanner = "pytanie o to czy gramy kolejny raz czy kończymy";
        return true;
    }
}
