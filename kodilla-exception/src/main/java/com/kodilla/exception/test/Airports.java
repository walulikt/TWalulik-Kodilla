package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class Airports {

    private String airportName;
    private Boolean isAvailbe;

    Map<String, Boolean> airportsMap = new HashMap<>();


    public String getAirportName() {
        return airportName;
    }

    public Boolean getAvailbe() {
        return isAvailbe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airports airports = (Airports) o;

        return getAirportName().equals(airports.getAirportName());
    }

    @Override
    public int hashCode() {
        return getAirportName().hashCode();
    }

    public Map<String, Boolean> getAirportsMap() {
        return airportsMap;
    }
}
