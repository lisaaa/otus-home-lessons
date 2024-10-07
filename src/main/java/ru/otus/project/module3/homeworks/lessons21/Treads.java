package ru.otus.project.module3.homeworks.lessons21;

public class Treads {

    public static void main(String[] args) throws InterruptedException {

        createArrWithoutTreads(100_000_000);//14sec
        createArrWithTreads(100_000_000);//4sec

    }

    public static void createArrWithoutTreads(int count) {

        double[] array = new double[count];

        for (int i = 0; i < count; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void createArrWithTreads(int count) throws InterruptedException {

        double[] array = new double[count];
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < count/4 ; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = count/4; i < count/2; i++) {
               array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = count/2; i < count*3/4; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = count*3/4; i < count; i++) {
              array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
    }


}
