package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop() {
        this.hasBeenHarvested = false;
        this.hasBeenFertilized = false;
    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    public void harvest() {
        this.hasBeenHarvested = true;
    }

}
