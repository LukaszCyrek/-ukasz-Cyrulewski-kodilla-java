package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {

    private String world;
    private final Set<Continent> listContinents = new HashSet<>();

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public Set<Continent> getListContinents() {
        return listContinents;
    }

    public World(String world) {

        this.world = world;
    }

    public Set<Country> getPeopleQuanity() {
        return listContinents.stream()
                .flatMap(continent -> continent.getListCountry().stream())
                .collect(Collectors.toSet());
    }
}

