package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class ExpressDecorator extends AbstractTaxiOrderDecorator {
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " express service";
    }

    public ExpressDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }
}
