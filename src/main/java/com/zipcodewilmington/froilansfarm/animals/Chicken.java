package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.plants.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    public boolean hasBeenFertilized;

    @Override
    public Edible yield() {
        if(hasBeenFertilized) {
            return new EdibleEgg();
        } else {
            return null;
        }
    }

    @Override
    public void eat(Edible edible) {
        System.out.println("peck peck");
    }

    @Override
    public void makeNoise() {
        System.out.println("buck buck buckawk");
    }

}
