package org.homework.fourTasks.threads;

// Напишіть програму, в якій створюється двовимірний цілочисловий масив.
//Програма знаходить в кожному рядку масиву елемент з найбільшим значенням.
//Пошук елементу з найбільшим значенням в кожному рядку виконується окремим
//потоком.
class ThreadFinder2 extends Thread {

    private int temp;

    int[][] numbers = {{44, 32, 12, 88, 99}, {123, 84, 34, 99, 105}, {-66, -70, -234, -270, -22},
            {-72, -996, -12, -15, -90}, {2, 32, 779, 27, -15}};

    public ThreadFinder2(String name, int temp) {
        super(name);
        this.temp = temp;
        start();

    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE;

        for (int i = temp; i < temp + 1; i++) {

            for (int j = 0; j < numbers.length; j++) {

                max = Math.max(max, numbers[i][j]);
            }
            System.out.println("Thread " + i + getName() + " max = " + max);
            max = Integer.MIN_VALUE;
        }

    }
}

class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            new ThreadFinder2("", i);
        }

    }
}
