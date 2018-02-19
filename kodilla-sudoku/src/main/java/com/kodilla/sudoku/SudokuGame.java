package com.kodilla.sudoku;

public class SudokuGame {

    public void introduction() {
        String menu = "Witam. Gra polega na... Przyklad: 1,2,7 - oznacza, ze w kolumnie 1, wierszu 2 ma zostac wprowadzona liczba 7. Zaczynamy!";
    }

    public void setTheElement() {
        String info = "Wybierz nr kolumny, nr wiersz i wartosc pola ";
        String elementData; //string ze Scannera
        int columnNumber; //StringToInt z elementData
        int rowNumber; //StringToInt z elementData
        int elementValue; //StringToInt z elementData

        //dowiedziec sie jak ustawic walidacje Stringa ze scanera, zeby przyjmowal wlasciwy format danych (np: 1,2,5 a nie 1,x,5)

        //tutaj metoda kopii klasy SudokuBoard z argumentami: (int nrKolumny, int nrWiersza, int wartosc pola)
    }

    public boolean resolveSudoku() {
        String scanner = "pytanie o to czy gramy kolejny raz czy kończymy";
        return true;
    }
}
