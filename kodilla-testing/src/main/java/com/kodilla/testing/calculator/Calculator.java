package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator () {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

     public int add(int a, int b) {
        this.a=a;
        this.b=b;
        return a+b;
    }


    public int subtract (int a, int b) {
        this.a=a;
        this.b=b;
        return a-b;
    }
}
