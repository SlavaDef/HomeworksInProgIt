package org.homework.collections.comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Створіть колекцію з випадкових чисел. Відсортуйте її в порядку зростання. При
//порівнянні чисел використати компаратор, який порівнює числа на основі суми
//цифр, які входять до складу числа. Наприклад, число 89 буде "більшим" за число
//123, оскільки 8+9=17, а 1+2+3=6 і 17>6.
public class ComparatorForAllNumbers {

    private final List<Integer> numbers;

    public ComparatorForAllNumbers() {
        numbers = new ArrayList<>();
    }

    public void initArray(int len) {
        for (int i = 0; i < len; i++) {
            numbers.add((int) (Math.random() * Integer.MAX_VALUE));
        }
    }

    public int findSumNumbers(int numb) {
        int temp = 0;
        while (numb != 0) {
            temp += numb % 10;
            numb = numb / 10;
        }
        return temp;
    }

    public static void main(String[] args) {
        ComparatorForAllNumbers comparator = new ComparatorForAllNumbers();
        comparator.initArray(8);
        System.out.println(comparator.numbers);
                      // enother case
       // comparator.numbers.sort(Comparator.comparingInt(comparator::findSumNumbers));

        Collections.sort(comparator.numbers, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return comparator.findSumNumbers(o1) - comparator.findSumNumbers(o2);
                    }
                }
        );

        System.out.println(comparator.numbers);

    }
}
