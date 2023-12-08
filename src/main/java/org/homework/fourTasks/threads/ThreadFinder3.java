package org.homework.fourTasks.threads;

// Напишіть програму, в якій створюється двовимірний цілочисловий масив.
//Програма знаходить в кожному рядку масиву елемент з найбільшим значенням.
//Пошук елементу з найбільшим значенням в кожному рядку виконується окремим
//потоком.
public class ThreadFinder3 extends Thread{

    private int temp;

    private int rows;
    private int columns;
    int[][] arr = new int[rows][columns];


    private final int[][] numbers = {{44, 32,  88, -2}, {123, 84, 99, -7}, {-66,  -234, -270, -1},
            {-72,  -12, -15, -6}, {44, 32, 12,  -2}, {44, 32,  88, -2}, { 32, 12, 88, -2}, {123, 84,  99, -7}};


    public ThreadFinder3(String name, int temp) {
        super(name);
        this.temp = temp;
        start();

    }

    public int getNumbers() {
        return numbers.length;
    }

    public ThreadFinder3() {
    }

    public int[][] createArray(int rows,int columns){

        return new int[rows][columns];
    }

    @Override
    public void run() {
        int max = Integer.MIN_VALUE;


        for (int i = temp; i < temp + 1; i++) { // завжди один прохід по стовпу[c][]

            for (int j = 0; j < numbers[0].length; j++) { // проход по значенням [][з]

                max = Math.max(max, numbers[i][j]);
            }
            System.out.println("Thread " + i + getName() + " max = " + max);


            max = Integer.MIN_VALUE;
        }

    }
}

class Test3 {

    public static void main(String[] args) {

        int a = new ThreadFinder3().getNumbers();
        System.out.println(a);

        for (int i = 0; i < a; i++) {
            new ThreadFinder2("", i);
        }


    }

}
