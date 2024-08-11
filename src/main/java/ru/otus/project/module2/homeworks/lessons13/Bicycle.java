package ru.otus.project.module2.homeworks.lessons13;

import static ru.otus.project.module2.homeworks.lessons13.Terrain.SWAMP;

public class Bicycle implements Transport {

    int distance;
    Terrain terrain;

    public Bicycle(int distance, Terrain terrain) {
        this.distance = distance;
        this.terrain = terrain;
    }


    @Override
    public void getOn(Human human) {

    }

    @Override
    public void getOff(Human human) {

    }

    @Override
    public boolean drive(Human human) {

        if (terrain.equals(SWAMP)) {
            return false;
        }

        return true;
    }
}
