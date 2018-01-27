package com.kodilla.stream.world;


import java.math.BigDecimal;

public final class Country {
    private final String nameCountry;

    public Country(String nameCountry, BigDecimal peopleQuanity) {
        this.nameCountry = nameCountry;
        this.peopleQuanity = peopleQuanity;
    }

    private final BigDecimal peopleQuanity;

    public BigDecimal getPeopleQuantity() {
        return  peopleQuanity;
    }

}
