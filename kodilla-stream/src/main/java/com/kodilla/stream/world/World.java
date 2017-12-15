package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World implements PeopleQuantity{


    List<Continent> theWorld =new ArrayList<>();


    @Override
    public BigDecimal getPeopleQuantity() {

        return theWorld.stream()
                .flatMap(continent -> continent.getTheContinent().stream())
                .filter(continent -> continent.equals(this))
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum.add(current));
    }

}
