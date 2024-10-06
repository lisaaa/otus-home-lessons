package ru.otus.project.module2.homeworks.lessons20.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try(Socket socket = new Socket("localhost", 8888);
            PingClient client = new PingClient(socket)
        ) {
            System.out.println("Доступные операции: " + client.read());
            System.out.println("Введите через пробел числа и операцию");
            String userInput = scanner.nextLine();
            client.send(userInput);
            System.out.println("Result = " + client.read());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}