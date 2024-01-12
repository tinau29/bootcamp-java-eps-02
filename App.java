package com.petstore;

import io.animal.Animal;
import io.animal.poultry.Poultry;
import io.animal.poultry.Chicken;
import io.animal.poultry.Crow;
import io.animal.fish.Dolphin;
import io.animal.fish.Fish;
import java.util.ArrayList;
import java.util.List;

class App {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Chicken("lala"));
        animals.add(new Crow("dipsy"));
        animals.add(new Dolphin("po"));

        for (Animal animal: animals) {
            System.out.print(
                "hi, my name is " + animal.name() + 
                ", i'am a " + animal.getClass().getSimpleName() + 
                ". i eat " + animal.feed() + " everyday.");
            if (animal instanceof Poultry) {
                Poultry poultry = (Poultry) animal;
                poultry.fly();
            } else if (animal instanceof Fish) {
                Dolphin dolphin = (Dolphin) animal;
                dolphin.swim();
            }

            System.out.println("--------------------------------");
        }

    }
}
