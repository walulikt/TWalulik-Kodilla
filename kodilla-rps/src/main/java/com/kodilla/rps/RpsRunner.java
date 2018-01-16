package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        RpsGame game = new RpsGame();
        game.greetingRpsMethod();
        System.out.println(game.toString());
        boolean end = false;

        while (end==false) {
            System.out.println("Co chcesz zrobić?");
            String thisAction= game.getUser().userAction(RpsGame.scanner.next());
            RpsGame.scanner.nextLine();
            if (thisAction.equals("n")){
                game.theGame();
            } else if (thisAction.equals("x")){
                System.out.println("Czy jesteś pewien, że chcesz zakończyć grę? 't' - Tak, 'n' - Nie");
                String endingAction = game.getUser().userAction(RpsGame.scanner.next());
                if (endingAction.equals("n")){
                    System.out.println(game.toString());
                } else if (endingAction.equals("t")){
                    end=true;
                }
            } else {
                System.out.println ("Nie mogę tego zrobić. Wybierz opcję z menu:");
                System.out.println(game.toString());
            }
        }
        game.scanner.close();
    }
}
