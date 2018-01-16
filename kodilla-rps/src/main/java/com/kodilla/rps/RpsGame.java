package com.kodilla.rps;

import java.util.Scanner;

public class RpsGame {

    private final static String ROCK ="1";
    private final static String PAPER ="2";
    private final static String SCISSORS ="3";
    private RpsRound rpsRound;
    private User user;

    public RpsGame() {
        this.user = new User();
        this.rpsRound = new RpsRound();
    }

    public static String getRock() {
        return ROCK;
    }

    public static String getPaper() {
        return PAPER;
    }

    public static String getScissors() {
        return SCISSORS;
    }

    public User getUser() {
        return user;
    }

    static Scanner scanner = new Scanner(System.in);

    public void greetingRpsMethod() {
        System.out.println("Podaj swoje imię: ");
        String scannedName = scanner.next();
        scanner.nextLine();
        user.setUserName(scannedName);
        System.out.println("Witaj w grze " + user.getUserName());
        System.out.println("Podaj ilość rund: ");
        int roundsNumber = scanner.nextInt();
        scanner.nextLine();
        rpsRound.setRound(roundsNumber);
    }

    @Override
    public String toString() {
        return "W grze RPS dostępne są następujące opcje: \n"+
                "Klawisz: " + ROCK + " - zagranie: 'kamień' \n" +
                "Klawisz: " + PAPER + " - zagranie: 'papier' \n" +
                "Klawisz: " + SCISSORS + " - zagranie: 'nożyczki' \n" +
                "Klawisz: x - zakończenie gry \n" +
                "Klawisz: n - nowa gra \n";
    }

    public void printRoundResult(){
        System.out.println("Wynik po rundzie " + rpsRound.getRoundCounter() + ": " + user.getUserName() + " " +rpsRound.getUserWinCounter()
                + ", Komputer " + rpsRound.getCompWinCounter());
    }

    public void theGame (){
        while ((rpsRound.getUserWinCounter()<=rpsRound.getRound())||(rpsRound.getCompWinCounter()<=rpsRound.getRound()) ) {
            System.out.print("Wykonaj swój ruch:");
            rpsRound.roundLoop(user);
            printRoundResult();
            if (rpsRound.getUserWinCounter()==rpsRound.getRound()){
                System.out.println ("****** Tą rozgrywkę wygrał " + user.getUserName()+ " z wynikiem: " + rpsRound.getUserWinCounter() +" do " +rpsRound.getCompWinCounter() +" ******");
                System.out.println(toString());
                rpsRound.setUserWinCounter(0);
                rpsRound.setCompWinCounter(0);
                rpsRound.setRoundCounter(0);
                break;
            } else if (rpsRound.getCompWinCounter()==rpsRound.getRound()) {
                System.out.println("****** Tą rozgrywkę wygrał KOMPUTER z wynikiem: " + rpsRound.getUserWinCounter() + " do " + rpsRound.getCompWinCounter() + " ******");
                System.out.println(toString());
                rpsRound.setUserWinCounter(0);
                rpsRound.setCompWinCounter(0);
                rpsRound.setRoundCounter(0);
                break;
            }
        }
    }
}
