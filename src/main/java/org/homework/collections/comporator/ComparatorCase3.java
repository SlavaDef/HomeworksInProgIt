package org.homework.collections.comporator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Створіть колекцію з випадкових чисел. Відсортуйте її в порядку зростання. При
//порівнянні чисел використати компаратор, який порівнює числа на основі суми
//цифр, які входять до складу числа. Наприклад, число 89 буде "більшим" за число
//123, оскільки 8+9=17, а 1+2+3=6 і 17>6.

public class ComparatorCase3 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int x, b, c, d, e, g;
        x = (Integer) o1 / 100;
        b = (Integer) o1 / 10 % 10;
        c = (Integer) o1 % 10;
        d = (Integer) o2 / 100;
        e = (Integer) o2 / 10 % 10;
        g = (Integer) o2 % 10;

        return (x + b + c) - (d + e + g);
    }
}

class TestCompare {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 1000));
        }
        list.sort(new ComparatorCase3());
        System.out.println(list);
    }
}


