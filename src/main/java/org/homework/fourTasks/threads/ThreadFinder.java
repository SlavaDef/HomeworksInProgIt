package org.homework.fourTasks.threads;

import java.util.ArrayList;
import java.util.List;

// Напишіть програму, в якій створюється двовимірний цілочисловий масив.
//Програма знаходить в кожному рядку масиву елемент з найбільшим значенням.
//Пошук елементу з найбільшим значенням в кожному рядку виконується окремим
//потоком.
public class ThreadFinder {
    int max = 0;

    public List<Integer> finder(int[][] numbers) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
            list.add(max);
            max = 0;
        }
        return list;
    }

    public static void main(String[] args) {

        int[][] numbers = {{44, 32, 12, 88, 99}, {123, 84, 34, 99, 105}, {66, 70, 234, 270, 22},
                {72, 996, 12, 15, 90}, {2, 32, 779, 27, 15}};

        Thread thread = new Thread(() -> {

                List<Integer> list = new ThreadFinder().finder(numbers);
                System.out.println("Thread first = " + list);
        });

        thread.start();

        ThreadFinder threadFinder = new ThreadFinder();
        System.out.println("Main thread = " + threadFinder.finder(numbers));
    }

}
