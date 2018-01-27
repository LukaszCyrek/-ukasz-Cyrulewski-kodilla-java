package com.kodilla.stream.world;


import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String nameContinent;
    private final Set<Country> listCountry = new HashSet<>();


    public Continent(String nameContinent) {
        this.nameContinent = nameContinent;

    }

    public String getNameContinent() {
        return nameContinent;
    }

    public Set<Country> getListCountry() {
        return listCountry;
    }

}


