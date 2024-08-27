package ru.otus.project.module2.homeworks.lessons16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, Person> list = new HashMap<>();
    
    public void add(String number, Person person) {

        list.put(number, person);

    }

    public List<String> find(String lastname) {

        ArrayList<String> numbers = new ArrayList<>();


        for (Map.Entry<String, Person> entry : list.entrySet()) {

            Person person = entry.getValue();

            if (person.getLastname().equals(lastname)) {

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
