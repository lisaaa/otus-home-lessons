package ru.otus.project.module2;

import java.time.LocalDate;
import java.time.Period;

public class User {

    private String name;
    private String surname;
    private String secondName;
    private String birthDate;
    private String email;



    public User(String name, String surname, String secondName, String birthDate, String email) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.email = email;
    }

    public  void info(){
        System.out.println("ФИО: " + surname +" " + name + " " + secondName
                        + "\nГод рождения: " + birthDate +
                "\ne-mail: " + email +"\n"
        );
    }

    public int getAge(){

        Period period = LocalDate.parse(birthDate).until(LocalDate.now());
        return period.getYears();
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
