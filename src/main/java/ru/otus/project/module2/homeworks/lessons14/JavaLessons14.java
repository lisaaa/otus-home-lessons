package ru.otus.project.module2.homeworks.lessons14;

public class JavaLessons14 {


    public static void main(String[] args) {

        char[][] arr1 = {{'a', 'b', 'c', '3', '1'}, {'1', '2', '3', '4', '4'}, {'1', '2', '3', '4', '4'}, {'1', '2', '3', '4', '4'}};
        String[][] arr2 = {{"1", "3"}, {"1", "2"}};


        try {
            castArrayCharToInt(arr2);
        } catch (AppArrayDataException ex) {

            System.out.println(ex.getMessage() + " " + ex.getI() + " " + ex.getJ());

        }

        try {
            checkArraySize(arr1);
        } catch (AppArraySizeException ex) {

            System.out.println(ex.getMessage());

        }


    }

    public static void checkArraySize(char[][] arrayString) {


        if (arrayString.length != 4) {

            throw new AppArraySizeException("Длина массива не равна 4");

        }


        for (int i = 0; i < arrayString.length; i++) {


            for (int j = 0; j < arrayString[i].length; j++) {


                if (arrayString[i].length != 4) {

                    throw new AppArraySizeException("Длина массива не равна 4");

                }
            }

        }

    }


    public static int castArrayCharToInt(String[][] arrayString) {

        int sum = 0;
        int[][] arrayInt = new int[arrayString.length][arrayString.length];

        for (int i = 0; i < arrayString.length; i++) {

            for (int j = 0; j < arrayString[i].length; j++) {

                try {

                    arrayInt[i][j] = Integer.parseInt(arrayString[i][j]);

                    sum += arrayInt[i][j];

                } catch (NumberFormatException ex) {

                    throw new AppArrayDataException("Ошибка при преобразовании  ячейки с номером ",i, j);

                }
            }
        }
        return sum;
    }


}
