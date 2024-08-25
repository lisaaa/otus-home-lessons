package ru.otus.project.module2.homeworks.lessons16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    HashMap<String, Object> list = new HashMap<>();

    public PhoneBook() {

    }

    public void add(String number, Person person) {

        list.put(number, person);

    }

    public ArrayList<String> find(String lastname) {

        ArrayList<String> numbers = new ArrayList<>();

        for (Map.Entry<String, Object> entry : list.entrySet()) {


            if (entry.getValue().toString().contains(lastname)) {

                numbers.add(entry.getKey());

            }

        }

        return numbers;

    }

    public boolean containsPhoneNumber(String number) {

        return list.containsKey(number);

    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "list=" + list +
                '}';
    }
}
