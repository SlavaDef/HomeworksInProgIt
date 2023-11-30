package org.homework.fourTasks.treads;

// Підклас MyThread створюється успадкуванням суперкласу Thread:

import java.util.Random;

class MyThread extends Thread {

    private int count; // Кількість повідомлень

    MyThread(String name, int count) { // Конструктор
        super(name); // Виклик конструктора суперкласу
        this.count = count; // Значення цілого поля
        start(); // Запуск потоку виконання
    } // Переозначення методу run():

    public void run() {
// Відображення повідомлення про запуск потоку:
        System.out.println("Виконується потік " + getName());
// Створення об'єкта класу Random для створення випадкових чисел:
        Random rnd = new Random();
// Оператор циклу, в якому виводяться повідомлення:
        for (int k = 1; k <= count; k++) {
            System.out.println("Повідомлення від потоку " + getName() + ": \t" + getName().charAt(0) + k);
            try {
// Затримка у виконанні потоку:
                Thread.sleep(1000 + rnd.nextInt(2001));
            } catch (InterruptedException e) {
                System.out.println("Переривання потоку " + getName());
            }
        }
// Повідомлення про завершення виконання потоку:
        System.out.println("Потік " + getName() + " завершено");
    }
}

class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Починає виконуватися головний потік");
// Створення об'єктів - запуск потоків:
        MyThread A = new MyThread("ALPHA", 5);
        MyThread B = new MyThread("BRAVO", 3);
        MyThread C = new MyThread("CHARLIE", 7);
// Повідомлення головного потоку:
        for (int k = 1; k <= 4; k++) {
            System.out.println("Повідомлення від головного потоку:\t" + k);
// Затримка у виконанні потоку:
            Thread.sleep(2000);
        } // Очікування завершення дочірніх потоків:
        if (A.isAlive()) {
            A.join();
        }
        if (B.isAlive()) {
            B.join();
        }
        if (C.isAlive()) {
            C.join();
        } // Повідомлення про завершення головного потоку:
        System.out.println("Головний потік завершено");
    }
}


