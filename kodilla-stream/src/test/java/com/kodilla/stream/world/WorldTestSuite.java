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

        Country poland = new Country();
        poland.peopleQuantity=new BigDecimal("400000002");
        Country german = new Country( );
        german.peopleQuantity=new BigDecimal("3000000003");
        Country france = new Country();
        france.peopleQuantity=new BigDecimal("2000000001");
        Country china = new Country();
        china.peopleQuantity=new BigDecimal("900000000009");
        Country india = new Country();
        india.peopleQuantity=new BigDecimal("800000000008");
        Country japan = new Country();
        japan.peopleQuantity=new BigDecimal("700000000007");
        Country egipt = new Country();
        egipt.peopleQuantity=new BigDecimal("600000000006");
        Country tunisia = new Country();
        tunisia.peopleQuantity=new BigDecimal("500000000005");
        Country maroco = new Country();
        maroco.peopleQuantity=new BigDecimal("400000000004");

        Continent asia=new Continent();
        asia.getTheContinent().add(china);
        asia.getTheContinent().add(india);
        asia.getTheContinent().add(japan);

        Continent europ = new Continent();
        europ.getTheContinent().add(poland);
        europ.getTheContinent().add(german);
        europ.getTheContinent().add(france);

        Continent africa = new Continent();
        africa.getTheContinent().add(egipt);
        africa.getTheContinent().add(tunisia);
        africa.getTheContinent().add(maroco);

        World world=new World();
        world.getTheWorld().add(asia);
        world.getTheWorld().add(europ);
        world.getTheWorld().add(africa);

        //When

        world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("3905400000045");
        Assert.assertEquals(expectedPeopleQuantity, world.getPeopleQuantity());

    }

}
