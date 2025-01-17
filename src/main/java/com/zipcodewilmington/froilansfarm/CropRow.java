package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.plants.Crop;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CropRow {

    private final List<Crop> row = new LinkedList<>();

    public CropRow() {}

    public CropRow(Crop crop) {
        this.row.add(crop);
    }

    public CropRow(Crop[] crops) {
        this.row.addAll(Arrays.asList(crops));
    }

    public CropRow(List<Crop> crops) {
        this.row.addAll(crops);
    }

    public List<Crop> getCrops() {
        return this.row;
    }

    public void store(Crop crop) {
        this.row.add(crop);
    }

    public void store(Crop[] crops) {
        this.row.addAll(Arrays.asList(crops));
    }

    public void store(List<Crop> crops) {
        this.row.addAll(crops);
    }


    public boolean fertilize() {
        for (Crop crop : this.row) {
            crop.fertilize();
        }

        return false;
    }

}
