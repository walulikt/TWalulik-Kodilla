package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    Airports airports = new Airports();

    public Map<String, Boolean> addAirport () {
        airports.getAirportsMap().put("Chopin", true);
        airports.getAirportsMap().put("Walesy", true);
        return airports.getAirportsMap();
        }

    public void findFilght(Flight flight) throws RouteNotFoundException{


            for (Map.Entry<String, Boolean> theFlightDepurter: airports.getAirportsMap().entrySet()) {
                if (flight.getDepartureAirport().equals(theFlightDepurter.getKey())) {
                    System.out.println("Wylot z lotniska: " + theFlightDepurter.getKey() + " jest dostępny: " + theFlightDepurter.getValue());
                } else if (!flight.getDepartureAirport().equals(theFlightDepurter.getKey())) {
                    throw new RouteNotFoundException();
                }
            }
            for (Map.Entry<String, Boolean> theFlightArrival: airports.getAirportsMap().entrySet()) {
                if (flight.getArrivalAirport().equals(theFlightArrival.getKey())) {
                    System.out.println("Lądowanie na lotnisku: " + theFlightArrival.getKey() + " jest dostępne: " + theFlightArrival.getValue());
                } else if (!flight.getArrivalAirport().equals(theFlightArrival.getKey())) {
                    throw new RouteNotFoundException();
                }
            }

        }
}
