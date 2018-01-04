package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {

    public String displayValue(double val) {
        String printResult = "wynik " + val;
        return printResult;
    }
}
