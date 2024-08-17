package ru.otus.project.module2.homeworks.lessons13;

public interface Transport {

    void getOn(Human human);
    void getOff(Human human);
    boolean move(Human human, Terrain terrain);

}

