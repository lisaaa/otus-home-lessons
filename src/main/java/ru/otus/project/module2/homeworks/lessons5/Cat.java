package ru.otus.project.module2.homeworks.lessons5;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int speedSwim, int hardiness) {
        super(name, speedRun, speedSwim, hardiness);
        this.swimHardinessConsumption = -1;
    }


}
