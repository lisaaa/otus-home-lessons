package ru.otus.project.module2.homeworks.lessons15;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaLessons15 {


    public static void main(String[] args) {

        //System.out.println(makeArray(1, 10));

        ArrayList<Integer> arr1 =  new ArrayList<>();
        //arr1.clear();
    //    System.out.println(sumArray(arr1));

        ArrayList<Integer> arr2 = changeArray(3,arr1);
        System.out.println(arr2);

       // ArrayList<Integer> arr3 = increaseArray(3,arr1);
        //System.out.println(arr3);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван",30));
        employees.add(new Employee("Петр",34));
        employees.add(new Employee("Герасим",45));
        employees.add(new Employee("Марк",25));

        //System.out.println(listEmployeeName(employees));
        //ArrayList<Employee> employees1 =  listEmployeeOlderThanAge(employees,30);
       // System.out.println(youngEmployee(employees).toString());

    }

    public static ArrayList<String> listEmployeeName(ArrayList<Employee> employees) {


        ArrayList<String> listName = new ArrayList<String>();

        for (int i = 0; i < employees.size(); i++) {

            listName.add(employees.get(i).getName());

        }

        return listName;

    }

    public static ArrayList<Employee> listEmployeeOlderThanAge(ArrayList<Employee> employees,int age) {


        ArrayList<Employee> listEmployees = new ArrayList<Employee>();

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getAge()>age){
                listEmployees.add(employees.get(i));
                System.out.println(employees.get(i).toString());
            }

        }

        return listEmployees;

    }

    public static boolean averageAge(ArrayList<Employee> employees, int age) {
        int sum = 0;

        for (int i = 0; i < employees.size(); i++) {


                sum += employees.get(i).getAge();


        }
        if (sum/ employees.size() > age){
            return true;
        };

        return false;
    }

    public static Employee youngEmployee(ArrayList<Employee> employees) {
        int minAge = employees.get(0).getAge();
        Employee minAgeEmployee = employees.get(0);


        for (int i = 0; i < employees.size(); i++) {

            if ( minAge > employees.get(i).getAge()) {

                minAge = employees.get(i).getAge();
                minAgeEmployee = employees.get(i);

            }

        }

        return minAgeEmployee;
    }



    public static ArrayList<Integer> makeArray(int min, int max) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = min; i < max; i++) {

            array.add(i);

        }

        return array;

    }

    public static int sumArray(ArrayList<Integer> array) {
        int sum = 0;

        for (int i = 0; i < array.size(); i++) {

            if(array.get(i) == 5){
                 sum += array.get(i);
            }

        }

        return sum;

    }

    public static ArrayList<Integer> changeArray(int number, ArrayList<Integer> array) {

        for (int i = 0; i < array.size(); i++) {

            if (!array.get(i).equals(null)) {

                array.set(i, number);
            }

        }

        return array;

    }

    public static ArrayList<Integer> increaseArray(int number, ArrayList<Integer> array) {

        for (int i = 0; i < array.size(); i++) {

            array.set(i, array.get(i) + number);

        }

        return array;

    }


}
