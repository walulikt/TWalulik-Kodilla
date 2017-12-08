package com.kodilla.testing.forum.com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit. *;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before (){
        System.out.println ("Początek test case.");
    }
    @After
    public void after () {
        System.out.println("Koniec test case");
    }
    @Test
    public void testOddNumbersExterminatorEmptyLis (){
        //Given
        OddNumbersExterminator exterminator=new OddNumbersExterminator();
        ArrayList <Integer> numbers = new ArrayList<>();
        //When
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numbers);
        //Then
        Assert.assertTrue(evenNumbers.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        OddNumbersExterminator exterminator=new OddNumbersExterminator();
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        //When
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numbers);
        //Then
        Assert.assertTrue(evenNumbers.contains(2)&&evenNumbers.contains(6)&&(!evenNumbers.contains(5)));
    }

}
