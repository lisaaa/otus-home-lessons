package ru.otus.project.module2.homeworks.lessons13;

public abstract class Vehicle {

    int petrol;
    int distance;

    public Vehicle(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }

    boolean hasPetrol() {

        if (petrol <= 0) {
            System.out.println("Бензин закончился!");
            return false;
        }
        petrol -= distance;

        return true;

    }

    ;
}
