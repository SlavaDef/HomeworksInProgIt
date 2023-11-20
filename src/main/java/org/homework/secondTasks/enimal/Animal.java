package org.homework.secondTasks.enimal;

// Створіть абстрактний клас Animal, який описує свійську тварину. У класу
//повинні бути поля: name (назва тварини), color (колір хутра), mass (маса тварини),
//age (вік тварини). У класу повинен бути конструктор, яким визначаються значення
//полів. Також там мають бути абстрактні методи: voice (повертає текст звуку, який
//створює тварина), repeat (повторює звук вказану кількість разів), jump (повертає
//результатом число, який визначає відстань, на яку може стрибнути тварина) , а
//також неабстрактний метод show (виводить повну інформацію про тварину).
//На основі абстрактного класу Animal шляхом спадкування створити класи Cat та
//Dog. Перевірити функціональність об’єктів класу.

public abstract class Animal {

    String name;
    String color;
    double mass;
    int age;

    public Animal(String name, String color, double mass, int age) {
        this.name = name;
        this.color = color;
        this.mass = mass;
        this.age = age;
    }

   public abstract String voice();

  public abstract void repeat(int times);

   public abstract double jump();

    public void show(){
        System.out.println("The name of the animal is "+ name+ ", his/her color is "+ color +
                ", his/her mass is "+ mass + ", age is " + age+"years old, " + voice());


    }


}
