package ru.otus.project.module2.homeworks.lessons13;

public class CrossCountryVehicle extends Vehicle implements Transport{

    public CrossCountryVehicle(int petrol, int distance) {
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

        if (hasPetrol()== false){
            System.out.println("Бензин закончился");
            return false;

        }

        System.out.println("Вездеход поехал!");
        return true;
    }
}
