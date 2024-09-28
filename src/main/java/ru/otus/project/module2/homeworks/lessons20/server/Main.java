package ru.otus.project.module2.homeworks.lessons20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while(true) {
            Socket clientAccept = serverSocket.accept();
            System.out.println("Client connected!");
            readRequest(clientAccept);
        }
    }

    private static void readRequest(Socket socket) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        String str = input.readUTF();
        System.out.println("User input:" +str);
        String calcResult;
        calcResult = String.valueOf(calc(str));
        System.out.println("Result: " + calcResult);
        output.writeUTF(calcResult);
        output.flush();
    }


    private static Integer calc(String input){

        Integer result = 0;
        String[] splited = input.split("\\s+");
        if (splited[2].trim().equals("+")){
            result  = Integer.valueOf(splited[0].trim()) + Integer.valueOf(splited[1].trim());
        } else if (splited[2].trim().equals("-")){
            result  = Integer.valueOf(splited[0].trim()) - Integer.valueOf(splited[1].trim());
        } else if (splited[2].trim().equals("*")){
            result  = Integer.valueOf(splited[0].trim()) * Integer.valueOf(splited[1].trim());
        } else if (splited[2].trim().equals("/")){
            result  = Integer.valueOf(splited[0].trim()) / Integer.valueOf(splited[1].trim());
        }
        return result;
    }
}