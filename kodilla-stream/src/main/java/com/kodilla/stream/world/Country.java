package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements PeopleQuantity{

private final String theCountry;
private final BigDecimal peopleQuantity;


public Country (final String theCountry, final BigDecimal peopleQuantity) {
    this.theCountry = theCountry;
    this.peopleQuantity=peopleQuantity;
}

    @Override
    public BigDecimal getPeopleQuantity() {
        return this.peopleQuantity;
    }

    public String getTheCountry() {
        return theCountry;
    }

}
