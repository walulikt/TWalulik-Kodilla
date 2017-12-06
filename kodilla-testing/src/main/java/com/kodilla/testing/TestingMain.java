package com.kodilla.testing;

import com.kodilla.testing.User.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calc = new Calculator();

        int addTestResult = calc.add(3,2);
        int subtractTestResult = calc.subtract(7,4);

        if (addTestResult==5) {
            System.out.println("Test dodwania: OK");
        } else {
            System.out.println("Error! - dodawanie");
        }
        if (subtractTestResult==3) {
            System.out.println("Test odejmowania: OK");
        } else {
            System.out.println("Error! - odejmowania");
        }
    }

}
