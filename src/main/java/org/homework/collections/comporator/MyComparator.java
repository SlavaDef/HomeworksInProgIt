package org.homework.collections.comporator;

import java.util.*;

// Створіть колекцію з випадкових чисел. Відсортуйте її в порядку зростання. При
//порівнянні чисел використати компаратор, який порівнює числа на основі суми
//цифр, які входять до складу числа. Наприклад, число 89 буде "більшим" за число
//123, оскільки 8+9=17, а 1+2+3=6 і 17>6.
public class MyComparator {

    private final List<Integer> numbers;

    public MyComparator(int len) {
        numbers = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            numbers.add((int) (Math.random() * 1000));
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {

        MyComparator myComparator = new MyComparator(10);

        System.out.println(myComparator.getNumbers());

        Collections.sort(myComparator.getNumbers(), new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 / 100 + (o1 / 10 % 10) + o1 % 10) - (o2 / 100 + (o2 / 10 % 10) + o2 % 10);
            }
        });
       // myComparator.getNumbers().sort(Comparator.comparingInt(o -> (o / 100 + (o / 10 % 10) + o % 10)));

        System.out.println(myComparator.getNumbers());
    }
}






