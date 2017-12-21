package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        RpsGame game = new RpsGame();

        game.greetingRpsMethod();


       while (game.getRound()>0) {

            game.userAction();
            game.roundLoop();
            //przenieść tu roundCounter++
            game.printRoundResult();

            int roundCounter=game.getRound();
            roundCounter--;
            System.out.println(roundCounter);

        }

        game.scanner.close();

    }
}
