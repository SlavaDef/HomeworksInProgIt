package org.homework.fourTasks.threads;

import static javax.swing.JOptionPane.*;

class Demon {

    public static void main(String[] args) throws InterruptedException {
         // Створення об'єкта дочірнього потоку. Перший
         // аргумент конструктора є лямбда-виразом,
         // другий аргумент - назва потоку:

        Thread t = new Thread(() -> {
         // Індексна змінна та
         // змінна для запису суми чисел:
            int k = 1, s = 0;
        // Нескінченний цикл для обчислення суми:
            while (true) {
        // Відображення повідомлення:
                System.out.println(Thread.currentThread().getName() + ": " + s);
        // Затримка у виконанні потоку:
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                // Доданок до суми:
                s += k;
         // Збільшення значення індексної змінної:
                k++;
            }
        }, "Обчислення суми"); // другий аргумент

       // Статус демон-потоку:
        t.setDaemon(true);
        // Змінна для запису результату
        // вибору користувача (натиснена кнопка):
        int res;
        // Запуск потоку на виконання:
        t.start();
        // Відображення діалогового вікна:
        do {
        // Затримка у виконанні потоку:
            Thread.sleep(3000);
        // Відображення вікна та запам'ятовування
         //вибору користувача:
            res = showConfirmDialog(null,
        // Текст у вікні:
                    "Закінчити обчислення суми?",
        // Назва вікна:
                    "Сума чисел",
       // Кнопки у вікні:
                    YES_NO_OPTION
            );
        } while (res != YES_OPTION);

    }
}
