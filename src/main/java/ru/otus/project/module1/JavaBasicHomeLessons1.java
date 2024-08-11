package ru.otus.project.module1;

import java.util.Random;
import java.util.Scanner;

public class JavaBasicHomeLessons1 {

    public static void main(String[] args) {
        chooseMetod();
    }

    public static void greetings(){
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c){
        int sum = a + b +c;
        if (sum >= 0){
            System.out.println("сумма положительная: " + "a = "+ a +" b = "+ b + " c = " + c + " сумма = " + sum);
        } else {
            System.out.println("сумма отрицательная: " + "a = "+ a +" b = "+ b + " c = " + c + " сумма = " + sum);
        }
    }

    public static void selectColor(int data){

        if (data <= 10){
            System.out.println("Красный. data  = " + data);
        } else if (data <= 20) {
            System.out.println("Желтый. data  = " + data);
        } else  {
            System.out.println("Зеленый. data  = " + data);
        }
    }

    public static void compareNumbers(int a, int b) {

        if (a >= b){
            System.out.println("Сравнение чисел: a >= b" + " a =" + a + " b="+ b);
        } else {
            System.out.println("Сравнение чисел: a < b"  + " a =" + a + " b="+ b);
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){

        if (increment == true) {
            int sum = initValue + delta;
            System.out.println( "Добавили дельту " + sum);
        } else {
            int sum = initValue - delta;
            System.out.println("Вычли дельту " + sum);
        }

    }

    public static void chooseMetod(){
        Random random = new Random();
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int number = scanner.nextInt();

        if (number == 1) {
            greetings();
        } else if ( number == 2) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int c = random.nextInt(100);
            checkSign(a,b,c);

        } else if (number == 3){

            int data = random.nextInt(100);
            selectColor(data);

        } else if (number == 4){

            int a = random.nextInt(10);
            int b = random.nextInt(10);
            compareNumbers(a, b);

        } else if (number == 5){


            int initValue = random.nextInt(10);
            int delta = random.nextInt(10);
            boolean increment = random.nextBoolean();
            addOrSubtractAndPrint(initValue, delta, increment);

        } else {
            System.out.println("Вы ввели неправильное число!");
        }
    }

}
