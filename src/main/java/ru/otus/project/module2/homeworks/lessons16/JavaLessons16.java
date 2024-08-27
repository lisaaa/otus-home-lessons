package ru.otus.project.module2.homeworks.lessons16;

public class JavaLessons16 {


    public static void main(String[] args) {

        Person p1 = new Person("name1", "sur1", "lastname1");
        Person p2 = new Person("name1", "sur2", "lastname2");
        Person p3 = new Person("name3", "sur3", "lastname3");
        Person p4 = new Person("name4", "sur4", "lastname4");
        Person p5 = new Person("name5", "sur5", "lastname5");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("111", p1);
        phoneBook.add("100", p1);
        phoneBook.add("222", p2);
        phoneBook.add("333", p3);
        phoneBook.add("444", p4);
        phoneBook.add("555", p5);

        phoneBook.find("lastname1");
        phoneBook.containsPhoneNumber("111");

        System.out.println(phoneBook.containsPhoneNumber("112"));
        System.out.println(phoneBook.find(p1.getLastname()));

    }

}
