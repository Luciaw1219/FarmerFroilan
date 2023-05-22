package com.zipcodewilmington.froilansfarm.animals;


import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.jupiter.api.Test;

public class ChickenTest {

    @Test
    void testMakeNoise() {
        Chicken chicken = new Chicken();
        chicken.makeNoise();
    }

    @Test
    void testYield() {
        Chicken chicken = new Chicken();
        chicken.hasBeenFertilized = true;
        Edible egg = chicken.yield();


        chicken.hasBeenFertilized = false;
        Edible noEgg = chicken.yield();

    }

    @Test
    void testEat() {
        Chicken chicken = new Chicken();

        chicken.eat(new Edible() {});
    }
}