package com.kodilla.good.patterns.airline;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightRegister {

    List <Flight> flightList= new ArrayList<>();

    public List<Flight> addFlight() {
        flightList.add(new Flight("Warszawa","Gdańsk",112,
                LocalDateTime.of(2017,12,31,10,00),
                LocalDateTime.of(2017,12,31,12,00)));
        flightList.add(new Flight("Warszawa","Gdańsk",112,
                LocalDateTime.of(2017,12,31,16,00),
                LocalDateTime.of(2017,12,31,18,00)));
        flightList.add(new Flight("Warszawa","Wrocław",234,
                LocalDateTime.of(2017,12,31,10,30),
                LocalDateTime.of(2017,12,31,12,00)));
        flightList.add(new Flight("Warszawa","Wrocław",234,
                LocalDateTime.of(2017,12,31,16,30),
                LocalDateTime.of(2017,12,31,18,00)));
        flightList.add(new Flight("Gdańsk","Warszawa",112,
                LocalDateTime.of(2017,12,31,13,00),
                LocalDateTime.of(2017,12,31,15,00)));
        flightList.add(new Flight("Gdańsk","Warszawa",112,
                LocalDateTime.of(2017,12,31,19,00),
                LocalDateTime.of(2017,12,31,21,00)));
        flightList.add(new Flight("Wrocław","Warszawa",234,
                LocalDateTime.of(2017,12,31,14,30),
                LocalDateTime.of(2017,12,31,16,00)));
        flightList.add(new Flight("Wrocław","Warszawa",234,
                LocalDateTime.of(2017,12,31,20,30),
                LocalDateTime.of(2017,12,31,22,00)));
        flightList.add(new Flight("Wrocław","Gdańsk",789,
                LocalDateTime.of(2017,12,31,13,40),
                LocalDateTime.of(2017,12,31,15,50)));
        flightList.add(new Flight("Gdańsk","Wrocław",789,
                LocalDateTime.of(2017,12,31,18,40),
                LocalDateTime.of(2017,12,31,21,50)));
        return flightList;
    }
}
