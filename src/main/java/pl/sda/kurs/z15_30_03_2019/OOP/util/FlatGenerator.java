package pl.sda.kurs.z15_30_03_2019.OOP.util;

import pl.sda.kurs.z15_30_03_2019.OOP.Flat;
import pl.sda.kurs.z15_30_03_2019.OOP.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static pl.sda.kurs.z15_30_03_2019.OOP.util.Creator.getOrNull;

public class FlatGenerator {

    Flat getRandomFlat() {
        return getOrNull(
                new Flat(getRandomArea(),
                        getRandomPeopleList()
                )
        );
    }

    private double getRandomArea() {
        Random r = new Random();
        double rangeMin = 30;
        double rangeMax = 150;
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue;
    }

    private List<Person> getRandomPeopleList() {
        PersonGenerator randomPerson = new PersonGenerator();
        Random ran = new Random();
        int peopleListSize = 1 + ran.nextInt(6);
        List<Person> randomPeopleList = new ArrayList<>();
        for (int i = 0; i < peopleListSize; i++){
            try {
                randomPeopleList.add(randomPerson.getRandomPerson());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return randomPeopleList;
    }
}
