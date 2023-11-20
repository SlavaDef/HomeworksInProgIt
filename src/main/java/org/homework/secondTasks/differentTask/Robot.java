package org.homework.secondTasks.differentTask;

// 1. Напишіть програму з класом, у якому є два цілочислових поля. У класі має бути
//дві версії конструктора: з двома аргументами та без аргументу. У класі має бути
//метод, що дозволяє створювати новий об'єкт того самого класу. Метод
//викликається з об'єкта класу та аргументом йому передається об'єкт того ж класу.
//Результатом повертається об'єкт, значення полів якого дорівнюють сумі значень
//полів вихідних об'єктів

public class Robot {

    private int size;

    private int weight;

    public Robot(int size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    public Robot() {
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public Robot create(Robot robot){


        Robot robot1 = new Robot(size,weight);

        robot1.size += robot.size;
        robot1.weight+= robot.weight;
        return robot1;
    }

    @Override
    public String toString() {
        return "Robot next {" +
                "with size=" + size +
                ", with weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Robot robot = new Robot(22,44);
        Robot robot2 = new Robot(26,64);
       System.out.println( robot.create(robot2));
    }
}
