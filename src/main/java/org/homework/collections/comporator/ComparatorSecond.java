package org.homework.collections.comporator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Створіть колекцію з випадкових чисел. Відсортуйте її в порядку зростання. При
//порівнянні чисел використати компаратор, який порівнює числа на основі суми
//цифр, які входять до складу числа. Наприклад, число 89 буде "більшим" за число
//123, оскільки 8+9=17, а 1+2+3=6 і 17>6.

public class ComparatorSecond {

    public ComparatorSecond(int len) {
      List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
        System.out.println("Before comparing: " + numbers);
        numbers.sort(Comparator.comparingInt(o -> (o / 100 + (o / 10 % 10) + o % 10)));
        System.out.println("After comparing: " + numbers);
    }

    public static void main(String[] args) {
        new ComparatorSecond(8);
    }
}


