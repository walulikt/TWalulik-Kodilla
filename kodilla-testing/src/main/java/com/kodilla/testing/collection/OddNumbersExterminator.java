package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate (ArrayList<Integer> example) {
        ArrayList <Integer> evenNumbers = new ArrayList<>();
        if (example.isEmpty()){
            System.out.println("Lista jest pusta");
        } else {
            for (Integer odd : example) {
                if (odd % 2 == 0) {
                    evenNumbers.add(odd);
                }

            }
        }
        return evenNumbers;
    }
}
