package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

import static com.zipcodewilmington.froilansfarm.days.EveryMorning.everyMorning;

public class Tuesday {
    public static void tuesday(Farmer farmer, Tractor tractor, Farm farm) {
        everyMorning();
        farmer.mount(tractor);
        List<Edible> yields = new ArrayList<>();
        for(Field field : farm.getFields()) {
            for(CropRow cropRow : field.getCropRows(0)) {
                for(Crop crop : cropRow.getCrops()) {
                    tractor.makeNoise();
                    yields.add(tractor.harvest(crop));
                }
            }
        }
    }
}
