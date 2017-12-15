package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

   private final List<Country> theContinent = new ArrayList<>();

     public List<Country> addCountry(Country country) {
            theContinent.add(country);
            return theContinent;
        }

    public List<Country> getTheContinent() {

        return theContinent;
    }


}
