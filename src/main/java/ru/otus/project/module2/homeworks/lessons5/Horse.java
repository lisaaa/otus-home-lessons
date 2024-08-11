package ru.otus.project.module2.homeworks.lessons5;

public class Horse extends Animal {


    public Horse(String name, int speedRun, int speedSwim, int hardiness) {
        super(name, speedRun, speedSwim, hardiness);
        this.swimHardinessConsumption = 2;
    }


}
