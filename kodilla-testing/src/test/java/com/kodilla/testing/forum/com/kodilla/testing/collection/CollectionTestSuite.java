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
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numbers);
        //When
        boolean result =evenNumbers.isEmpty() ;
        //Then
        Assert.assertTrue("Lista jest pusta",result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        OddNumbersExterminator exterminator=new OddNumbersExterminator();
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        ArrayList<Integer> evenNumbers = exterminator.exterminate(numbers);
        //When
        boolean result = evenNumbers.contains(2)&&evenNumbers.contains(6);
        //Then
        Assert.assertTrue(result);
    }

}
