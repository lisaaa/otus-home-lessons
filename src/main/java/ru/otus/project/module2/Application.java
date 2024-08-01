package ru.otus.project.module2;


public class Application {

    public static void main(String[] args) {

        User[] users = new User[10];
        users[0] = new User("Иван", "Иванов", "Иванович", "1987-01-04", "test0@mail.com");
        users[1] = new User("Петр", "Петров", "Петрович", "1977-03-02", "test1@mail.com");
        users[2] = new User("Алексей", "Алексеев", "Алексеевич", "1990-04-06", "test2@mail.com");
        users[3] = new User("Соловей", "Соловьев", "Соловьевич", "1945-02-04", "test3@mail.com");
        users[4] = new User("Воробей", "Воробьев", "Воробьевич", "1923-09-09", "test4@mail.com");
        users[5] = new User("Котофей", "Котофеев", "Котофеич", "2023-02-12", "test5@mail.com");
        users[6] = new User("Муравей", "Муравьев", "Муравьевич", "2012-12-23", "test6@mail.com");
        users[7] = new User("Собакен", "Собакенов", "Собакевич", "1956-11-14", "test7@mail.com");
        users[8] = new User("ИИвв", "ИИвинов", "ИИвинович", "1989-10-15", "test8@mail.com");
        users[9] = new User("УУвап", "УУвапов", "УУпавич", "2000-10-25", "test9@mail.com");


        for (int i = 0; i < users.length; i++) {

            if (users[i].getAge(users[i].getBirthDate()) > 40){

                users[i].info();

            }

        }

        Box box = new Box(12,3,45,"зеленый", "карандаш", false);
     
        box.removeItem();
        box.addItem("hexrf");
        box.setColor("красный");
        box.setHight(3);
        box.getHight();
        box.info();

    }







}
