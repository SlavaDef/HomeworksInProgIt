package org.homework.firstTask;

import org.homework.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Напишіть програму з класом, у якого є два цілочислових поля і метод, який виводить в консоль значення цих полів

public class PersonInfo {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(PersonInfo.class);

    public PersonInfo(int age, int height) {
        this.age = age;
        this.height = height;
    }

    public PersonInfo() {
    }

    private int age;

    private int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void info(){
        System.out.println("The age of the person is - "+ getAge()+" years old, " +
                "ang his/her height is "+ getHeight() + "sm");
    }

    public void log(){
        LOGGER.info("age = {}, height = {}", age,height);
    }
}
