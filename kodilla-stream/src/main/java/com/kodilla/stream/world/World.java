package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World implements PeopleQuantity{


    List<Continent> theWorld =new ArrayList<>();

    public List<Continent> getTheWorld(Continent continent) {
        theWorld.add(continent);
        return theWorld;
    }

    @Override
    public BigDecimal getPeopleQuantity() {

        return theWorld.stream()
                .flatMap(continent -> continent.addConuntry().stream())
                .filter(continent -> continent.equals(this))
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current) -> sum.add(current));
    }

}
