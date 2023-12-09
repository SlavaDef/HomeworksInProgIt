package org.homework.jenerics;

//  Напишіть програму з узагальненим методом, у якого є таки аргументи: масив
//узагальненого типу, значення того самого узагальненого типу, і цілочислове
//значення. Метод присвоює значення (другий аргумент) елементу масиву (перший
//аргумент) з індексом, який визначається третім аргументом. Перевірити роботу
//методу на масивах різних типів.

public class Frog {

    public <T> T[] method(T[] arr, T value, int numb) {
        arr[numb] = value;
        return arr;
    }

    public static void main(String[] args) {
        String[] arrS = new String[10];
        Double[] arrD = new Double[10];
        Character[] arrC = new Character[10];
        Integer[] arrI = new Integer[10];
        Float[] arrF = new Float[5];
        Long[] arrL = new Long[10];

        new Frog().method(arrS, "hello", 5);
        new Frog().method(arrD, 2.45, 3);
        new Frog().method(arrC, 'F', 2);
        new Frog().method(arrI, 34, 8);
        new Frog().method(arrF, 22.54f, 1);
        new Frog().method(arrL, 8333333333034533L, 4);

        System.out.println("arrS[5] = " + arrS[5]);
        System.out.println("arrD[3] = " + arrD[3]);
        System.out.println("arrC[2] = " + arrC[2]);
        System.out.println("arrI[8] = " + arrI[8]);
        System.out.println("arrF[1] = " + arrF[1]);
        System.out.println("arrL[4] = " + arrL[4]);
    }

}
