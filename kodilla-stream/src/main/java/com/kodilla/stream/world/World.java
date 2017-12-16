package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {


    private  final  List<Continent> theWorld =new ArrayList<>();

    public BigDecimal getPeopleQuantity() {

        return theWorld.stream()
                .flatMap(continent -> continent.getTheContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum.add(current));
    }

    public List<Continent> getTheWorld() {
        return theWorld;
    }
}
