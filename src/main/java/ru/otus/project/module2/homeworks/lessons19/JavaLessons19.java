package ru.otus.project.module2.homeworks.lessons19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class JavaLessons19 {

    private final static File dir = new File("folder");
    private static String filePath;


    public static void main(String[] args) {

        printFileName();
        inputFileName();
        printTextFromFile();
        writeTextToFile();
        printTextFromFile();
    }

    private static void printFileName() {

        if (dir.isDirectory()) {
            for (File f : dir.listFiles()) {
                System.out.println(f.getName());
            }
        } else {
            System.out.println("Не папка");
        }
    }

    private static void inputFileName() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");
        String fileName = scanner.next();

        for (File f : dir.listFiles()) {
            if (f.getName().equals(fileName)) {
                filePath = f.getAbsolutePath();
            }
        }
    }

    private static void printTextFromFile() {

        try (InputStreamReader in = new InputStreamReader(new FileInputStream(filePath))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeTextToFile() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите любой текст");
        String data = scanner.next();

        try (FileOutputStream out = new FileOutputStream(filePath, true)) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
