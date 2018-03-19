package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaOrderDecorator {

    public SalamiDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getValue(){
        return super.getValue().add(new BigDecimal(5));
    }

    @Override
    public String getPizza(){
        return super.getPizza()+", + salami";
    }
}
