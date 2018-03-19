package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getValue(){
        return new BigDecimal(15);
    }

    @Override
    public String getPizza(){
        return "Pizza with tomato sos and chees";
    }
}
