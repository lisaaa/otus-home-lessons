package ru.otus.project.module2;

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
    };


    public void info() {

        System.out.println("Длина: " + lenght + "\n"
                + "Высота: " + hight + "\n"
                + "Ширина: " + width + "\n"
                + "Цвет: " + color + "\n"
                + "В коробке предмет: " + item + "\n");
    };

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


    };

    public void removeItem() {

        System.out.println("Из коробки удален предмет " + item);
        item = null;

    };

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        System.out.println("Изменить длину коробки нельзя!");
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        System.out.println("Изменить высоту коробки нельзя!");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        System.out.println("Изменить ширину коробки нельзя!");
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

    public void setItem(String item) {
        this.item = item;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }


}
