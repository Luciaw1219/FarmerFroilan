package com.zipcodewilmington.froilansfarm.days;

import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.buildings.Stable;
import org.junit.jupiter.api.Test;

import java.util.List;

class EveryMorningTest {


    //		* Every morning, `Froilan` and `Froilanda` begin their morning by
    //			* Riding each `Horse` in each `Stable`.
    //			* Feeding each `Horse` 3 ear of `Corn`.
    //			* For breakfast,
    //				* `Froilan` eats 1 `EarCorn`, 2 `Tomoato`, and 5 `Egg`.
    //				* `Froilanda` eats 2 `EarCorn`, 1 `Tomoato`, and 2 `Egg`.

    @Test
    void everyMorning() {
        //GIVEN
        Farmer farmer = new Farmer("Froilan");
        Farmer farmer2 = new Farmer("Froilanda");

        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();

        //put horse objects in stable
        stable1.addHorse(horse1);
        stable2.addHorse(horse2);

        //add food after plant classes are created

        //

    }

}
