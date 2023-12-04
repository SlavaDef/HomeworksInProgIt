package org.homework.fourTasks.threads;

class MyNumber { // Клас із цілим полем
    int number;
}
// Клас створення потоків:
class MyThread2 extends Thread {
    private MyNumber obj; // Посилання на об'єкт із цілим полем
    private int time; // Довжина паузи у виконанні потоку
    private int count; // Кількість циклів
    private boolean state; // Поле логічного типу

    MyThread2(String name, MyNumber obj, int time, int count, boolean state) {
        super(name); // Виклик конструктора суперкласу
        this.obj = obj; // Посилання на об'єкт
        this.time = time; // Інтервал затримки
        this.count = count; // Кількість циклів
        this.state = state; // Значення поля логічного типу
        start(); // Запуск потоку
    }
    // Метод для відображення "лінії" із символів:
    private void line() {
        char s; // Локальна символьна змінна
        if (state) s = '-'; // Значення змінної
        else s = '*';
        for (int k = 1; k <= 35; k++) { // Відображення послідовності символів
            System.out.print(s);
        }
        System.out.println();
    }

    public void run() {
        for (int k = 1; k <= count; k++) { // Оператор циклу
            synchronized (obj) { // Блок синхронізації
                line(); // Відображається "лінія"
                // Відображення повідомлення:
                System.out.println("Потік " + getName() + ": вихідне значення " + obj.number);
                try { // Контрольований код
                    Thread.sleep(time); // Затримка у виконанні потоку
                } // Обробка винятку:
                catch (InterruptedException e) {
                    System.out.println(e);
                } // Зміна значення поля об'єкта:
                if (state) obj.number++;
                else obj.number--;
                 // Відображення повідомлення:
                System.out.println("Потік " + getName() + ": нове значення " + obj.number);
                line(); // Відображення "лінії"
            } // Завершення блоку синхронізації
        }
    }
}


class Demo {

    public static void main(String[] args) {
        // Цілочислові змінні:
        int n = 100, count = 5, time = 1000, dt = 200;
        // Створення об'єкта з цілим полем:
        MyNumber obj = new MyNumber();
        // Надає полю об'єкта значення:
        obj.number = n;
       // Створення першого потоку:
        MyThread2 Alpha = new MyThread2("Alpha", obj, time + dt, count, true);
       // Створення другого потоку:
        MyThread2 Bravo = new MyThread2("Bravo", obj, time - dt, count, false);
       // Контрольований код:
        try {
       // Очікування завершення потоків:
            if (Alpha.isAlive()) Alpha.join();
            if (Bravo.isAlive()) Bravo.join();
        } // Обробка виключення:
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

