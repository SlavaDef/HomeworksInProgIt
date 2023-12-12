package org.homework.fourTasks.threads;


import java.util.Arrays;

import static org.homework.fourTasks.threads.Array.initAndCreateArray;


// Напишіть програму, в якій створюється двовимірний цілочисловий масив.
//Програма знаходить в кожному рядку масиву елемент з найбільшим значенням.
//Пошук елементу з найбільшим значенням в кожному рядку виконується окремим
//потоком.
public class ThreadFinder3 extends Thread {

    private final int temp;

    private final int[][] arr;

    public ThreadFinder3(String name, int temp, int[][] arr) {
        super(name);
        this.temp = temp;
        this.arr = arr;
        start();
    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE;

        for (int i = temp; i < temp + 1; i++) { // завжди один прохід по стовпу[c][] =9

            for (int j = 0; j < arr[0].length; j++) { // проход по значенням [][з] =4

                max = Math.max(max, arr[i][j]);
            }
            System.out.println("Thread " + i + " max = " + max);

            max = Integer.MIN_VALUE;
        }
    }
}

class Test3 {

    public static void main(String[] args) {

        int rows = 15;

        int[][] arr = initAndCreateArray(rows, 12);

        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < rows; i++) {
            new ThreadFinder3("", i, arr);
        }
    }
}

class Array {

    public static int[][] initAndCreateArray(int rows, int columns) {
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = (int) (Math.random() * (-100));
                } else {
                    arr[i][j] = (int) (Math.random() * 100);
                }
            }
        }
        return arr;
    }
}
