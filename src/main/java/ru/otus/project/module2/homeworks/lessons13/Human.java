package ru.otus.project.module2.homeworks.lessons13;

public class Human  {
    String name;
    String currentTransport;
    int power;
    int distance;

    public Human(String name, String currentTransport, int power, int distance) {
        this.name = name;
        this.currentTransport = currentTransport;
        this.power = power;
        this.distance = distance;
    }

    public boolean walk() {

        if (power <= 0 ){
            System.out.println("Силы у человека закончились!");
            power = 0;
            return false;
        }

        power -= distance;
        return true;



    }
}
