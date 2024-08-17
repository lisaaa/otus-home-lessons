package ru.otus.project.module2.homeworks.lessons12;

public class Plate {

    int maxFoodLevel;
    int currentFoodLevel;


    public Plate(int maxFoodLevel) {
        this.maxFoodLevel = maxFoodLevel;
        currentFoodLevel = 0;
    }

    public boolean addFood(FoodPacket foodPacket) {

        if (currentFoodLevel + foodPacket.getFood() > maxFoodLevel) {

            System.out.println("Тарелка переполнена");
            currentFoodLevel = maxFoodLevel;
            return false;
        }

        currentFoodLevel = foodPacket.getFood();

        return true;

    }

    public boolean decreaseFood(int food) {

        currentFoodLevel -= food;

        if (currentFoodLevel <= 0) {
            return false;
        }

        return true;
    }
}
