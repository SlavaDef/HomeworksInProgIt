package org.homework.fourTasks.threads;

// Напишіть програму, в якій створюються два потоки. Обидва потоки працюють
//з числовим масивом, створеним у головному потоці. Перший потік розраховує
//суму елементів на парних позиціях у масиві (елементи з індексами 0, 2, 4 і так
//далі), а другий потік розраховує суму елементів на непарних позиціях у масиві
//(елементи з індексами 1,3, 5 і так далі). Результати розрахунків виводяться у
//консоль
class TwoThreads {

    public static void main(String[] args) {

        int[] numbers = new int[]{32, 14, 66, 89, 88, 12, 34, 55, 70, 123, 54, 678, 12, 0, 3, 97};

        int first = 0;

        Thread thread = new Thread(new Runnable() {
            int second = 0;

            public void run() {
                for (int i = 0; i < numbers.length; i++) {
                    if (i % 2 == 0) {

                        second += numbers[i];
                        System.out.println("Second Thread count = " + second);
                    }
                }

            }
        });
        thread.start();

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {

                first += numbers[i];
                System.out.println("Main Thread count = " + first);
            }
        }
    }
}

