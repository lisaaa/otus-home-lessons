package ru.otus.project.module2.homeworks.lessons13;

import static ru.otus.project.module2.homeworks.lessons13.Terrain.SWAMP;

public class Horse implements Transport{

    int power;
    int distance;
    Terrain terrain;

    public Horse(int power, Terrain terrain, int distance) {
        this.power = power;
        this.terrain = terrain;
        this.distance = distance;
    }

    @Override
    public void getOn(Human human) {

    }

    @Override
    public void getOff(Human human) {

    }

    @Override
    public boolean drive (Human human) {

        if (terrain.equals(SWAMP)) {
            System.out.println("Лошадь не может уехать по болоту");
            return false;
        }

        if (power == 0 ){
            System.out.println("Силы у лошади закончились");
            power = 0;
            return false;
        }

        power -= distance;

        return true;

    }
}
