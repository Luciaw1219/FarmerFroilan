package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Vehicle implements Rideable, NoiseMaker {

    @Override
    public void makeNoise(){
    System.out.println("Vroom Vroom");
    }

}
