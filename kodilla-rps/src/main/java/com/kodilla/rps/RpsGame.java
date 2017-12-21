package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    private String rock ="1";
    private String paper ="2";
    private String scissors ="3";
    private int round;
    private int roundCounter;
    private int userWinCounter;
    private int compWinCounter;

    public String getRock() {
        return rock;
    }

    public String getPaper() {
        return paper;
    }

    public String getScissors() {
        return scissors;
    }

    Scanner scanner = new Scanner(System.in);
    User user =new User();
    RpsRound rpsRound=new RpsRound();


    public String userAction (){
        String action=scanner.next();
        scanner.nextLine();
        return action;

    }

    public void greetingRpsMethod() {

        System.out.println("Podaj swoje imię: ");
        String scannedName = scanner.next();
        scanner.nextLine();
        user.setUserName(scannedName);
        System.out.println("Witaj w grze " + user.getUserName());
        System.out.println("Podaj ilość rund: ");
        int roundsNumber = scanner.nextInt();
        scanner.nextLine();
        setRound(roundsNumber);
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "W grze RPS dostępne są następujące opcje: \n"+
                "Klawisz: " + rock + " - zagranie: 'kamień' \n" +
                "Klawisz: " + paper + " - zagranie: 'papier' \n" +
                "Klawisz: " + scissors + " - zagranie: 'nożyczki' \n" +
                "Klawisz: x - zakończenie gry \n" +
                "Klawisz: n - nowa gra \n";
    }

    public void printRoundResult(){
        System.out.println("Wynik po rundzie: " + getRoundCounter() + '/' + getRound() + " = " + user.getUserName() + " " + getUserWinCounter()
                + ", Komputer " + getCompWinCounter());
    }


    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public void setRoundCounter(int roundCounter) {
        this.roundCounter = roundCounter;
    }

    public int getUserWinCounter() {
        return userWinCounter;
    }

    public void setUserWinCounter(int userWinCounter) {
        this.userWinCounter = userWinCounter;
    }

    public int getCompWinCounter() {
        return compWinCounter;
    }

    public void setCompWinCounter(int compWinCounter) {
        this.compWinCounter = compWinCounter;
    }

    public void roundLoop() {
        Random rnd = new Random();
        int compShape = rnd.nextInt(3) + 1;
        int win=0;
        int theRound=0;//wykasować
        if ((userAction().equals(getRock())) && (compShape == 1)) {
            System.out.println("REMIS: " +user.getUserName() + ": 'kamień', Komputer: 'kamień'.");
            setRoundCounter(++theRound);

        } else if ((userAction().equals(getPaper())) && (compShape == 2)) {
            System.out.println("REMIS: " +user.getUserName() + ": 'papier', Komputer: 'papier'.");
            setRoundCounter(++theRound);
        } else if ((userAction().equals(getScissors())) && (compShape == 3)) {
            System.out.println("REMIS: " +user.getUserName() + ": 'nożyce', Komputer: 'nożyce'.");
            setRoundCounter(++theRound);
        } else if ((userAction().equals(getRock())) && (compShape == 2)) {
            System.out.println("Komputer wygrywa: " +user.getUserName() + ": 'kamień', Komputer: 'papier'.");
            setRoundCounter(++theRound);
            setCompWinCounter(compWinCounter++);
        } else if ((userAction().equals(getRock())) && (compShape == 3)) {
            System.out.println(user.getUserName() + " wygrywa: " +user.getUserName() + ": 'kamień', Komputer: 'nożyce'.");
            setRoundCounter(++theRound);
            setUserWinCounter(++win+getUserWinCounter());
        } else if ((userAction().equals(getPaper())) && (compShape == 1)) {
            System.out.println(user.getUserName() + " wygrywa: " +user.getUserName() + ": 'papier', Komputer: 'kamień'.");
            setRoundCounter(++theRound);
            setUserWinCounter(userWinCounter++);
        } else if ((userAction().equals(getPaper())) && (compShape == 3)) {
            System.out.println("Komputer wygrywa: " +user.getUserName() + ": 'papier', Komputer: 'nożyce'.");
            setRoundCounter(++theRound);
            setCompWinCounter(compWinCounter++);
        } else if ((userAction().equals(getScissors())) && (compShape == 1)) {
            System.out.println("Komputer wygrywa: " +user.getUserName() + ": 'nożyce', Komputer: 'kamień'.");
            setRoundCounter(++theRound);
            setCompWinCounter(compWinCounter++);
        } else if ((userAction().equals(getScissors())) && (compShape == 2)) {
            System.out.println(user.getUserName() + " wygrywa: " +user.getUserName() + ": 'nożyce', Komputer: 'papier'.");
            setRoundCounter(++theRound);
            setUserWinCounter(userWinCounter++);
        }

    }
}
