package ru.otus.project.module2.homeworks.lessons14;

public class AppArrayDataException extends RuntimeException{


    private int i;
    private int j;

    public AppArrayDataException(String message, int i, int j) {
        super(message);
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
