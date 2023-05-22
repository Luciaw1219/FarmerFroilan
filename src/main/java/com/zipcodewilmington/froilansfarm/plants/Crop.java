package com.zipcodewilmington.froilansfarm.plants;

import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private boolean harvested;
    private boolean fertilized;

    public Crop(String corn) {
        this.harvested = false;
        this.fertilized = false;
    }

    public void fertilize() {
        this.fertilized = true;
    }

    public void harvest() {
        this.harvested = true;
    }

    public boolean isFertilized() {
        return fertilized;
    }

    public boolean isHarvested() {
        return harvested;
    }

}
