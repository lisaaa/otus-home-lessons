package ru.otus.project.module2.homeworks.lessons5;

public class Dog extends Animal {

    int spendingSwim = 4;

    public Dog(String name, int speedRun, int speedSwim, int hardiness) {
        super(name, speedRun, speedSwim, hardiness);
    }


    @Override
    public int swim(int distance) {

        hardiness = hardiness - spendingSwim * distance;

        return super.swim(distance);

    }

}
