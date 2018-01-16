package com.kodilla.rps;

import java.util.Random;

import static com.kodilla.rps.RpsGame.getPaper;
import static com.kodilla.rps.RpsGame.getRock;
import static com.kodilla.rps.RpsGame.getScissors;

public class RpsRound {
    private int round;
    private int roundCounter;
    private int userWinCounter;
    private int compWinCounter;

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

    public void roundLoop(User user) {
        Random rnd = new Random();
        int compShape = rnd.nextInt(3) + 1;
        String userAction = RpsGame.scanner.next();
        RpsGame.scanner.nextLine();
        if (userAction.equals(getRock()) && (compShape == 1)) {
            System.out.println("REMIS: " +user.getUserName() + ": 'kamień', Komputer: 'kamień'.");
            setRoundCounter(getRoundCounter()+1);
        } else if ((userAction.equals(getPaper())) && (compShape == 2)) {
            System.out.println("REMIS: " +user.getUserName() + ": 'papier', Komputer: 'papier'.");
            setRoundCounter(getRoundCounter()+1);
        } else if ((userAction.equals(getScissors())) && (compShape == 3)) {
            System.out.println("REMIS: " +user.getUserName() + ": 'nożyce', Komputer: 'nożyce'.");
            setRoundCounter(getRoundCounter()+1);
        } else if ((userAction.equals(getRock())) && (compShape == 2)) {
            System.out.println("Komputer wygrywa: " +user.getUserName() + ": 'kamień', Komputer: 'papier'.");
            setRoundCounter(getRoundCounter()+1);
            setCompWinCounter(getCompWinCounter()+1);
        } else if ((userAction.equals(getRock())) && (compShape == 3)) {
            System.out.println(user.getUserName() + " wygrywa: " +user.getUserName() + ": 'kamień', Komputer: 'nożyce'.");
            setRoundCounter(getRoundCounter()+1);
            setUserWinCounter(getUserWinCounter()+1);
        } else if ((userAction.equals(getPaper())) && (compShape == 1)) {
            System.out.println(user.getUserName() + " wygrywa: " +user.getUserName() + ": 'papier', Komputer: 'kamień'.");
            setRoundCounter(getRoundCounter()+1);
            setUserWinCounter(getUserWinCounter()+1);;
        } else if ((userAction.equals(getPaper())) && (compShape == 3)) {
            System.out.println("Komputer wygrywa: " +user.getUserName() + ": 'papier', Komputer: 'nożyce'.");
            setRoundCounter(getRoundCounter()+1);
            setCompWinCounter(getCompWinCounter()+1);
        } else if ((userAction.equals(getScissors())) && (compShape == 1)) {
            System.out.println("Komputer wygrywa: " +user.getUserName() + ": 'nożyce', Komputer: 'kamień'.");
            setRoundCounter(getRoundCounter()+1);
            setCompWinCounter(getCompWinCounter()+1);
        } else if ((userAction.equals(getScissors())) && (compShape == 2)) {
            System.out.println(user.getUserName() + " wygrywa: " +user.getUserName() + ": 'nożyce', Komputer: 'papier'.");
            setRoundCounter(getRoundCounter()+1);
            setUserWinCounter(getUserWinCounter()+1);
        } else {
            System.out.println("Nie możesz dokonać takiego wyboru.");
        }
    }
}

