package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    Airports airports = new Airports();
    public Map<String, Boolean> addAirport () {
        airports.getAirports().put("Chopin", true);
        airports.getAirports().put("Walesy", true);
        return airports.getAirports();
        }

    public void findFilght(Flight flight) {

        for (Map.Entry<String, Boolean> theFlight: airports.getAirports().entrySet()){
            if (flight.getDepartureAirport().equals(theFlight.getKey())){
             System.out.println("Wylot z lotniska: " + theFlight.getKey() + " jest dostępny: " + theFlight.getValue());
            } else if (flight.getArrivalAirport().equals(theFlight.getKey())) {
                System.out.println("Lądowanie na lotnisku: " + theFlight.getKey() + " jest dostępne: " + theFlight.getValue());
            }

        }
    }
}
