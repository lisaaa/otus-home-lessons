package ru.otus.project.module2;


import ru.otus.project.module2.homeworks.lessons5.Cat;
import ru.otus.project.module2.homeworks.lessons5.Dog;
import ru.otus.project.module2.homeworks.lessons5.Horse;

public class Application {

    public static void main(String[] args) {

        Cat cat = new Cat("kitty", 10, 2, 5);
        Dog dog = new Dog("doggy", 10, 5, 15);
        Horse horse = new Horse("pony", 120, 20, 40);

        System.out.println("Усталость: " + dog.getHardiness());
        System.out.println(dog.swim(20));
        System.out.println("Усталость: " + dog.getHardiness());
        System.out.println(dog.run(30));
        System.out.println("Усталость: " + dog.getHardiness());
        dog.info();

    }

}
