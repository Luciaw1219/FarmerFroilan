package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.plants.Crop;

import java.util.List;

public class Sunday {
    private CropRow cropRow1;
    private CropRow cropRow2;
    private CropRow cropRow3;

    public void plantCrops() {
        Crop cornCrop = new Crop("Corn") {
            @Override
            public Edible yield() {
                return null;
            }
        };
        Crop tomatoCrop = new Crop("Tomato") {
            @Override
            public Edible yield() {
                return null;
            }
        };
        Crop eggplantCrop = new Crop("Eggplant") {
            @Override
            public Edible yield() {
                return null;
            }
        };

        cropRow1 = new CropRow((List<Crop>) cornCrop);
        cropRow2 = new CropRow((List<Crop>) tomatoCrop);
        cropRow3 = new CropRow((List<Crop>) eggplantCrop);
    }

    public CropRow getCropRow1() {
        return cropRow1;
    }

    public CropRow getCropRow2() {
        return cropRow2;
    }

    public CropRow getCropRow3() {
        return cropRow3;
    }
}

