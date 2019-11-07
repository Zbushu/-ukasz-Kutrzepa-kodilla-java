package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {
    protected ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getValue() {
        return super.getValue().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", extra cheese";
    }
}
