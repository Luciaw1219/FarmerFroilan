package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    private List<Horse> horses = new ArrayList<>();

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public void rideHorse() {
    }

    public void feedHorse(int i) {
    }
}
