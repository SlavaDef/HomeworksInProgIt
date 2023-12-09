package org.homework.fourTasks.threads;


// Напишіть програму, в якій створюється двовимірний цілочисловий масив.
//Програма знаходить в кожному рядку масиву елемент з найбільшим значенням.
//Пошук елементу з найбільшим значенням в кожному рядку виконується окремим
//потоком.
public class ThreadFinder3 extends Thread {

    private  final int temp, rows, columns;

    public ThreadFinder3(String name, int temp, int rows, int columns) {
        super(name);
        this.temp = temp;
        this.rows = rows;
        this.columns = columns;
        start();

    }

    public int[][] initArray(int rows, int columns) {
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                if (i%2==0){
                    arr[i][j] = (int) (Math.random() * ((-100 - 200) + 1)) -200;
                }else {
                    arr[i][j] = (int) (Math.random() * ((1000 - 200) + 1)) + 200;
                }
            }
        }
        return arr;
    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE;

        int[][] arr = initArray(rows, columns);
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

        int rows = 9;
        int columns = 9;

        for (int i = 0; i < rows; i++) {
            new ThreadFinder3("", i, rows, columns);
        }

    }
}
