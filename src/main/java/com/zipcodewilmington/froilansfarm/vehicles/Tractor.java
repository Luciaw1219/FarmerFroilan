package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.plants.Crop;

public class Tractor extends FarmVehicle {

    public void harvest(Crop crop) {
        crop.harvest();
    }

}
