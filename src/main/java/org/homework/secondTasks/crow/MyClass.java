package org.homework.secondTasks.crow;

//// Напишіть програму, where є два статичних методи first() та second(). Аргументом
////кожному з методів передається об’єкт. Метод first() викликає з об’єкта методи
////void show() та void set(int), а в методі second() з об’єкта викликаються методи
////void set() та String get(). Описати клас MyClass, об’єкти якого можна передавати
////аргументом кожному з методів. Клас повинен реалізувати два інтерфейси Alpha та
////Bravo. В Alpha оголошені методі show() та set(), а в Bravo оголошені методи show()
////та get(). Аргумент методу first() має тип Alpha, а аргумент методу second() має тип
////Bravo.
public class MyClass implements Alfa, Bravo {

    int number;


    @Override
    public void show() {
        System.out.println("Hello from Alpha, my number is  "+ number);
    }

    @Override
    public String get() {
        return "now number = "+ number;
    }

    @Override
    public void set(int a) {
        number = a;
    }


    static void first(MyClass alfa) {
        alfa.set(8);
        alfa.show();

    }

    static void second(MyClass bravo) {
          bravo.set(88);
          bravo.get();

    }
}
