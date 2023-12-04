package org.homework.fourTasks.threads;

import java.util.ArrayList;
import java.util.List;

// Напишіть програму, в якій створюється двовимірний цілочисловий масив.
//Програма знаходить в кожному рядку масиву елемент з найбільшим значенням.
//Пошук елементу з найбільшим значенням в кожному рядку виконується окремим
//потоком.

public class ThreadFinder {
    int min = Integer.MIN_VALUE;


    public List<Integer> finder(int[][] numbers, int thread) {

        List<Integer> list = new ArrayList<>();

        for (int i = thread; i < thread+1; i++) {

            for (int j = 0; j < numbers.length; j++) {

                    min = Math.max(min,numbers[i][j]);
            }
            list.add(min);
            min = Integer.MIN_VALUE;
        }
        return list;
    }

    public static void main(String[] args) {

        int[][] numbers = {{44, 32, 12, 88, 99}, {123, 84, 34, 99, 105}, {-66, -70, -234, -270, -22},
                {-72, -996, -12, -15, -90}, {2, 32, 779, 27, -15}};

        Thread thread1 = new Thread(() -> {

                List<Integer> list = new ThreadFinder().finder(numbers,0);
                System.out.println("Thread first max = " + list);
        });

        Thread thread2 = new Thread(() -> {

            List<Integer> list = new ThreadFinder().finder(numbers,1);
            System.out.println("Thread second max = " + list);
        });

        Thread thread3 = new Thread(() -> {

            List<Integer> list = new ThreadFinder().finder(numbers,2);
            System.out.println("Thread three max = " + list);
        });

        Thread thread4 = new Thread(() -> {

            List<Integer> list = new ThreadFinder().finder(numbers,3);
            System.out.println("Thread four max = " + list);
        });

        Thread thread5 = new Thread(() -> {

            List<Integer> list = new ThreadFinder().finder(numbers,4);
            System.out.println("Thread five max = " + list);
        });


       thread5.start();
        thread2.start();
        thread1.start();
        thread3.start();
        thread4.start();

    }

}
