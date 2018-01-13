package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBicmacBuilder () {
        //Give
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sesame roll")
                .burgers(2)
                .sauce("standard")
                .ingredients("salat")
                .ingredients("onion")
                .ingredients("chees")
                .ingredients("becon")
                .build();
        System.out.println (bigmac);

        //When
        int ingredientsNumber = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, ingredientsNumber);
    }
}
