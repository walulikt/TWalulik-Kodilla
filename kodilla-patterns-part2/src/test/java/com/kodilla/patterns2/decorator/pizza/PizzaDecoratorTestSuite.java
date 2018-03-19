package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaDecoratorTestSuite {

    @Test
    public void bestPizzaTest(){
        //Given
        PizzaOrder pizzaOrder= new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder= new OlivesDecorator(pizzaOrder);
        pizzaOrder=new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder= new SizeDecorator(pizzaOrder);

        //When
        BigDecimal pizzaCost = pizzaOrder.getValue();
        String pizzaDescription = pizzaOrder.getPizza();

        //Then
        Assert.assertEquals(new BigDecimal(39),pizzaCost);
        System.out.println(pizzaDescription);
    }
}
