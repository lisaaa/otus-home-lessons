package ru.otus.project.module2.homeworks.lessons13;

public class Human  {
    String name;
    String currentTransport;


    public Human(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }


    public void walk() {

        System.out.println("Человек гуляет");

    }
}
