package org.homework.secondTasks.differentTask;

// Напишіть програму з класом, в якому є символьне поле. В
//головному класі опишіть статичний метод, який на основі
//символьного аргументу створює об'єкт відповідного класу

public class Cat {

    char name;

    public Cat(char name) {
        this.name = name;
    }

    static Cat create(char a) {

        return new Cat(a);

    }

}
