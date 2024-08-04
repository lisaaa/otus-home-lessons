package ru.otus.project.module2.homeLessons5;

public class Dog extends Animal {

    public Dog(String name, int speedRun, int speedSwim, int hardiness) {
        super(name, speedRun, speedSwim, hardiness);
    }


    public int swim(int distance) {

        if (hardiness <= 0) {
            isTired = true;
            System.out.println(name + " устал!");
            return -1;
        }
        hardiness = hardiness - 2 * distance;
        int time = distance / speedSwim;

        System.out.println(name + " плывет");
        return time;

    }

}
