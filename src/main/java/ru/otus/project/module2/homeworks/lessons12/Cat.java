package ru.otus.project.module2.homeworks.lessons12;

public class Cat {

    String name;
    int appetite;
    boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public void eat(Plate plate) {

        if (isHungry) {
            System.out.println(name + " поел");
            plate.decreaseFood(10);
            isHungry = false;
            appetite -= 0;
        } else {
            System.out.println(name + " не голоден");
        }
    }

    public void info(){
        System.out.println(name + " " + appetite + " " + isHungry);
    }

}
