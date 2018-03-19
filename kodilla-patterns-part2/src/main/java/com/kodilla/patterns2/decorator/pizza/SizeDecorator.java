package com.kodilla.patterns2.decorator.pizza;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.math.BigDecimal;

public class SizeDecorator extends AbstractPizzaOrderDecorator{
    public SizeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getValue(){
        return super.getValue().add(new BigDecimal(10));
    }

    @Override
    public String getPizza(){
        return super.getPizza()+", size: +5cm";
    }
}
