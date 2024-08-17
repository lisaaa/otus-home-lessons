package ru.otus.project.module2.homeworks.lessons12;

public class MainApp {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0]  = new Cat("Барсик", 4 );
        cats[1] = new Cat("Пушок", 5 );
        cats[2] = new Cat("Мурзик", 2 );

        Plate plate = new Plate(100);

        plate.addFood(new FoodPacket(70));


        for (int i = 0; i < cats.length; i++) {

            cats[i].eat(plate);
            cats[i].info();

        }

    }
}
