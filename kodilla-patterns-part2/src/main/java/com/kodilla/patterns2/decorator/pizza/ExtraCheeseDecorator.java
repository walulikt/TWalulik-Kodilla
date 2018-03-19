package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator{
    public ExtraCheeseDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getValue(){
        return super.getValue().add(new BigDecimal(4));
    }

    @Override
    public String getPizza() {
        return super.getPizza()+", + extra cheese";
    }
}
