package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage () {
        //Given


        int [] numbers = {100,100,20};


        // When
        ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(60,ArrayOperations.getAverage(numbers),0);






    }
}
