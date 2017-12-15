package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity () {
        //Give

        Country poland = new Country("Poland", new BigDecimal("400000002"));
        Country german = new Country("German", new BigDecimal("3000000003"));
        Country france = new Country("France", new BigDecimal("2000000001"));

        Country china = new Country("China", new BigDecimal("900000000009"));
        Country india = new Country("India", new BigDecimal("800000000008"));
        Country japan = new Country("Japan", new BigDecimal("700000000007"));

        Country egipt = new Country("Egipt", new BigDecimal("600000000006"));
        Country tunisia = new Country("Tunisia", new BigDecimal("500000000005"));
        Country maroco = new Country("India", new BigDecimal("400000000004"));

        Continent asia=new Continent();
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);

        Continent europ = new Continent();
        europ.addCountry(poland);
        europ.addCountry(german);
        europ.addCountry(france);

        Continent africa = new Continent();
        africa.addCountry(egipt);
        africa.addCountry(tunisia);
        africa.addCountry(maroco);

        World world=new World();
        List<Continent> theWorld =new ArrayList<>();

        theWorld.add(asia);
        theWorld.add(europ);
        theWorld.add(africa);

        //When

        world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3905400000045");
        Assert.assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());

    }

}
