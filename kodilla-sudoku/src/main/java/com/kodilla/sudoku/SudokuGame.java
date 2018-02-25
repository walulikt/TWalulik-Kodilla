package com.kodilla.sudoku;


public class SudokuGame {

    public static final String MENU = "Witam. Gra polega na wstawieniu do Sudoku wybranych przez siebie liczb i umożliwieniu rozwiązania całej łąmigłówki programowi poprzez wpisanie komendy SUDOKU."+ '\n' +
            " Przyklad: '1,2,7' - oznacza, ze w kolumnie 1, wierszu 2 ma zostac wprowadzona liczba 7. Pamiętaj o wpisaniu ','." + '\n' +
            "Jak już wprowadzisz wszystkie liczby wpisz słowo 'SUDOKU' a program zajmie się resztą :)." + '\n' +
            "W celu zakończenia gry wpisz 'EXIT'"+'\n'+"Zaczynamy!";
    public static final String SET_INPUT_INFORMATION="Wybierz nr kolumny, nr wiersz i wartosc pola, albo napis SUDOKU aby rozwiązać";
    private SudokuBoard sB;
    private int columnNumber;
    private int rowNumber;
    private int elementValue;

    public SudokuBoard getsB() {
        return sB;
    }

    public SudokuBoard createBoard(){
        sB=new SudokuBoard();
        for (int b=0; b<9; b++) {
            sB.getBoard().add(new SudokuRow());
        }
        for (SudokuRow row: sB.getBoard()) {
            for (int b=0; b<9; b++) {
                sB.getBoard().get(b).getRow().add(new SudokuElement());
            }
        }
        return sB;
    }

    public void setTheElement(String userInput) throws NumberFormatException{
        String[] elementData = userInput.split(",");
        columnNumber = Integer.parseInt(elementData[0])-1;
        rowNumber= Integer.parseInt(elementData[1])-1;
        elementValue = Integer.parseInt(elementData[2]);

        for (int rowIndex=0 ; rowIndex<sB.getBoard().size(); rowIndex++)
            if (sB.getBoard().get(rowIndex).getRow().get(columnNumber).equals(sB.getBoard().get(rowNumber).getRow().get(elementValue))){ //sprawdzanie w każdym wierszu dla danego indeksu
                System.out.println("Niedozwolona wartość (" + elementValue + ") dla pozycji kolumna: " + columnNumber + ", wiersz: " + rowNumber + '\n'
                        + "Taka wartość występuje już w tej kolumnie. Wprowadź dane jeszcze raz!");
            } else if ((rowIndex==rowNumber)&&(sB.getBoard().get(rowIndex).getRow().contains(sB.getBoard().get(rowIndex).getRow().get(elementValue)))) { //sprawdzanie w danym wierszu dla danego indeksu
                System.out.println("Niedozwolona wartość (" + elementValue + ") dla pozycji kolumna: " + columnNumber + ", wiersz: " + rowNumber + '\n'
                        + "Taka wartość występuje już w tym wierszu. Wprowadź dane jeszcze raz!");
            } else if ((rowIndex==rowNumber)&&(columnNumber==0||columnNumber%3==0)&&(rowNumber==0||rowNumber%3==0)) { //dla pozycji 00 i odpowiednika
                for (int i=columnNumber+1; i<columnNumber+3;i++){
                    if (sB.getBoard().get(rowIndex+1).getRow().get(i).equals(sB.getBoard().get(rowNumber).getRow().get(elementValue))){}
                    if (sB.getBoard().get(rowIndex+2).getRow().get(i).equals(sB.getBoard().get(rowNumber).getRow().get(elementValue))){}

            }
                /*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                int skip = 3;
                int size = list.size();
                // Limit to carefully avoid IndexOutOfBoundsException
                int limit = size / skip + Math.min(size % skip, 1);

                List<Integer> result = Stream.iterate(list, l -> l.subList(skip, l.size()))
                        .limit(limit)
                        .map(l -> l.get(0))
                        .collect(Collectors.toList());

                System.out.println(result); // [1, 4, 7, 10]*/
            } else {
                sB.getBoard().get(rowNumber).getRow().get(columnNumber).setValue(elementValue);
                System.out.println ("Dane wprowadzono");
            }
    }

    public void printSudokuBoard (){
        for (SudokuRow r: sB.getBoard())
            System.out.println(r);
    }

    public boolean resolveSudoku() {
        String scanner = "pytanie o to czy gramy kolejny raz czy kończymy";
        return true;
    }
}
