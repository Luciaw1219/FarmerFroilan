package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    @Override
    public void eat(Edible edible) {
        System.out.println("munch munch");
    }

    @Override
    public void makeNoise() {
        System.out.println("neigh");
    }

}
