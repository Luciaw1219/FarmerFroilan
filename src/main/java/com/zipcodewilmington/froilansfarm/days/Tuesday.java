package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.plants.Farm;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import static com.zipcodewilmington.froilansfarm.days.EveryMorning.everyMorning;

public class Tuesday {
    public static void tuesday(Farmer farmer, Tractor tractor, Farm farm) {
        everyMorning();
        farmer.mount(tractor);
        //TODO
        /*tractor.operate(farm);
        for(CropRow row : farm.getField().getArea()) {
            for(Crop crop : row.getRow()) {
                tractor.makeNoise();
                crop.harvest();
            }
        }*/
    }
}
