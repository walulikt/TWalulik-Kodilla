package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage () {
        //Given

        ArrayOperations arrayOperationsMock;
        int [] numbers = {1,2,3,4,5};


        // When
        ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(2,ArrayOperations.getAverage(numbers),0);






    }
}
