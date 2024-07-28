package ru.otus.project;

public class JavaBasicHomeLessons3 {

    public static void main(String[] args) {

        int[][] arr1 = {{1, -1, 1, 1, 1}, {-1, 0, 0, 0, 0}};
        int[][] arr2 = {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 765, 5}};
        int[][] arr3 = {{1, 1, 1, 1, 1}, {3, 3, 3, 3, 3}};


        System.out.println(sumOfPositiveElements(arr1));

        printSquare(5);
        zeroDiagonal(arr2);

        System.out.println(findMax(arr2));

        System.out.println(sumSecodLineElements(arr3));

    }

    public static int sumOfPositiveElements(int[][] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > 0)

                    sum += array[i][j];

            }

        }

        return sum;

    }


    public static void printSquare(int size) {


        char[][] array = new char[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void zeroDiagonal(int[][] array) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


                if (i == j) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }

    }

    public static int findMax(int[][] array) {
        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max) {
                    max = array[i][j];
                }
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }

        return max;

    }

    public static int sumSecodLineElements(int[][] array) {

        int sum = 0;

        if (array.length == 1) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (i == 1) {

                    sum += array[i][j];

                }

            }
        }
        return sum;
    }

}
