package com.kodilla.patterns2.decorator.pizza;
import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void pizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ChickenDecorator(pizzaOrder);

        //When
        BigDecimal calculatedCost = pizzaOrder.getValue();
        String description = pizzaOrder.getDescription();

        //Then
        assertEquals(new BigDecimal(19),calculatedCost);
        assertEquals("Pizza with: tomato sauce, cheese, extra cheese, chicken", description);
    }
}
