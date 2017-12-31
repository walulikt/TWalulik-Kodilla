package com.kodilla.good.patterns.airline;

import java.time.LocalDate;

public class AirlineApplication {
    public static void main (String [] args) {
        FlightRegister flightRegister=new FlightRegister();
        flightRegister.addFlight();

        FlightSearcher flightSearcher=new FlightSearcher("Warszawa",  LocalDate.of(2017,12,31));

        flightSearcher.flightsToFrom(flightRegister);
        flightSearcher.flightsToFromThrough(flightRegister);
        flightSearcher.flightsFrom(flightRegister);
        flightSearcher.flightsTo(flightRegister);


    }
}
