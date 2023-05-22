package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.CropRow;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SundayTest {

 @Test
    public void testPlantCrops() {
        // Setup
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        CropRow cropRow3 = new CropRow();

        Sunday sunday = new Sunday();
        sunday.getCropRow1();
        sunday.getCropRow2();
        sunday.getCropRow3();

        // Action
        sunday.plantCrops();

        // Assertion
        assertEquals("Corn", cropRow1.getCrop().getBytes());
        assertEquals("Tomato", cropRow2.getCrop().getBytes());
        assertEquals("Eggplant", cropRow3.getCrop().getBytes());
    }
}




