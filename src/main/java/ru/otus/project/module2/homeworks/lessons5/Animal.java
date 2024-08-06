package ru.otus.project.module2.homeworks.lessons5;

abstract public class Animal {

    String name;
    int speedRun;
    int speedSwim;
    int hardiness;

    boolean isTired;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public void setSpeedSwim(int speedSwim) {
        this.speedSwim = speedSwim;
    }

    public int getHardiness() {
        return hardiness;
    }


    public Animal(String name, int speedRun, int speedSwim, int hardiness) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.hardiness = hardiness;
    }

    public int run(int distance) {

        hardiness = -distance;

        if (hardiness <= 0) {
            isTired = true;
            System.out.println(name + " устал!");
            return -1;
        }

        System.out.println(name + " бежит");
        int time = distance / speedRun;

        return time;
    }

    public int swim(int distance) {

        if (hardiness <= 0) {
            isTired = true;
            System.out.println(name + " устал!");
            return -1;
        }

        return distance / speedSwim;
    }


    public void info() {
        System.out.println("Имя: " + name
                + "\n Скорость бега: " + speedRun
                + "\n Скорость плавания: " + speedSwim
                + "\n Выносливость: " + hardiness
                + "\n Устал: " + isTired);
    }

}
