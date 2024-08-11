package ru.otus.project.module2;


import ru.otus.project.module2.homeworks.lessons13.Car;
import ru.otus.project.module2.homeworks.lessons13.Human;


import static ru.otus.project.module2.homeworks.lessons13.Terrain.PLAIN;
import static ru.otus.project.module2.homeworks.lessons13.Terrain.SWAMP;

public class Application {

    public static void main(String[] args) {



        Human human = new Human("bdfy","машина");
        Car car = new Car(10,100,SWAMP);
        Car car2 = new Car(10,100,PLAIN);
        human.walk();
        car.drive(human);
        car2.drive(human);


    }

}
