package io.animal.poultry;

import io.animal.Animal;

public abstract class Poultry implements Animal {

    protected final String name;

    Poultry(String name) {
        this.name = name;
    }

    abstract public String name();

    abstract public String feed();

    abstract public void fly();
}
