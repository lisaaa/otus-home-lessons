package ru.otus.project;

import java.util.Arrays;

public class JavaBasicHomeLessons2 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 1, 1};


        printWord(5, "Слово");
        sumArrayNumbers(arr);
        changeArrayNumbers(6, arr);
        increaseArrayNumbers(1, arr);
        compareArrayParts(arr);


    }

    public static void printWord(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    public static void sumArrayNumbers(int[] arrayNumbers) {

        int sum = 0;

        for (int i = 0; i < arrayNumbers.length; i++) {

            if (arrayNumbers[i] > 5) {
                sum += arrayNumbers[i];
            }
        }
        System.out.println(sum);
    }

    public static void changeArrayNumbers(int number, int[] arrayNumbers) {


        for (int i = 0; i < arrayNumbers.length; i++) {

            arrayNumbers[i] = number;
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }

    public static void increaseArrayNumbers(int number, int[] arrayNumbers) {

        for (int i = 0; i < arrayNumbers.length; i++) {

            arrayNumbers[i] = arrayNumbers[i] + number;
        }
        System.out.println(Arrays.toString(arrayNumbers));
    }

    public static void compareArrayParts(int[] arrayNumbers) {

        int sumLeftPart = 0;
        int sumRightPart = 0;
        int arrayLenghtLeftPart;

        if (arrayNumbers.length % 2 == 0) {

            arrayLenghtLeftPart = arrayNumbers.length / 2;

        } else {
            arrayLenghtLeftPart = arrayNumbers.length / 2 + 1;
        }

        for (int i = 0; i < arrayLenghtLeftPart; i++) {

            sumLeftPart += arrayNumbers[i];
        }
        for (int i = arrayLenghtLeftPart; i < arrayNumbers.length; i++) {

            sumRightPart += arrayNumbers[i];
        }
        if (sumLeftPart > sumRightPart) {

            System.out.println("Сумма левой половины массива больше");

        } else if (sumLeftPart == sumRightPart) {

            System.out.println("Суммы половин массива равны");
        }

        else  {

            System.out.println("Сумма правой половины массива больше");

        }
    }

}
