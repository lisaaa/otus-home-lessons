package ru.otus.project.module2.homeLessons4;

public class Box {

    private int lenght;
    private int hight;
    private int width;
    private String color;
    private String item;
    private Boolean isOpen;

    public Box(int lenght, int hight, int width, String color, String item, Boolean isOpen) {
        this.lenght = lenght;
        this.hight = hight;
        this.width = width;
        this.color = color;
        this.item = item;
        this.isOpen = isOpen;
    }

    public void open() {

        isOpen = true;

        System.out.println("Коробка открыта");
    }

    public void close() {

        isOpen = false;

        System.out.println("Коробка закрыта");
    }

    public void info() {

        System.out.println("Длина: " + lenght + "\n"
                + "Высота: " + hight + "\n"
                + "Ширина: " + width + "\n"
                + "Цвет: " + color + "\n"
                + "В коробке предмет: " + item + "\n"
                + "Коробка открыта: " + isOpen);
    }

    public void addItem(String newItem) {

        if (isOpen == false) {

            open();
        }

        if (item == null) {
            item = newItem;
            System.out.println("В коробку добавлен предмет " + newItem);
        } else {
            System.out.println("В коробке уже есть предмет " + item);
        }


    }

    public void removeItem() {

        if (isOpen == false) {

            open();
        }

        if (item == null) {
            System.out.println("Коробка пуста!");
        } else {

            System.out.println("Из коробки удален предмет " + item);
            item = null;
        }


    }


    public int getLenght() {
        return lenght;
    }


    public int getHight() {
        return hight;
    }


    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет коробки изменен на " + color);
    }

    public String getItem() {
        return item;
    }


    public Boolean getOpen() {
        return isOpen;
    }


}
