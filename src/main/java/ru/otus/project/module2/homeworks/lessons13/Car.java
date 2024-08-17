package ru.otus.project.module2.homeworks.lessons13;

import static ru.otus.project.module2.homeworks.lessons13.Terrain.FOREST;
import static ru.otus.project.module2.homeworks.lessons13.Terrain.SWAMP;

public class Car extends Vehicle implements Transport {

    Terrain terrain;

    public Car(int petrol, int distance) {
        super(petrol, distance);


    }

    @Override
    public void getOn(Human human) {

    }

    @Override
    public void getOff(Human human) {

    }

    @Override
    public boolean move(Human human, Terrain terrain) {

        if (terrain.equals(SWAMP)||terrain.equals(FOREST)) {
            System.out.println("Машина не может ехать по этой местности");
            return false;
        }

        if (hasPetrol()== false){
            System.out.println("Бензин закончился");
            return false;

        }

        System.out.println("Машина поехала!");

        return true;

    }
}
