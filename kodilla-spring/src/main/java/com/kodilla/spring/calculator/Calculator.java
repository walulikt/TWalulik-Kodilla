package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    Display display;

    public double add(double a, double b) {
        double addResult = a+b;
        System.out.println ("Równanie: " + a + " + "+ b + " daje " + display.displayValue(addResult));
        return addResult;
    }
    public double sub(double a, double b) {
        double subResult = a-b;
        System.out.println ("Równanie: " + a + " - "+ b + " daje " + display.displayValue(subResult));
        return subResult;
    }
    public double mul(double a, double b) {
        double mulResult = a*b;
        System.out.println ("Równanie: " + a + " * "+ b + " daje " + display.displayValue(mulResult));
        return mulResult;
    }
    public double div(double a, double b) {
        double divResult = a/b;
        System.out.println ("Równanie: " + a + " / "+ b + " daje " + display.displayValue(divResult));
        return divResult;
    }

}
