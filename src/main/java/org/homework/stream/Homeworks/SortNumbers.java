package org.homework.stream.Homeworks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


// Из списка целых чисел, выделите те значения которых больше 10, отсортируйте по значению
// последней цифры результат выведите на экран.
public class SortNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(22, -2, 15, 44, 99, 6, 13, 19, 27, -8, 101);

        List<Integer> numb = numbers.stream()
                .filter(a -> a > 10)
                .sorted(Comparator.comparingInt(a -> a % 10)) // from small to big
                // .sorted((a, b) -> b % 10 - a % 10) // from big to small
                .collect(Collectors.toList());

      /*  Stream<Integer> sorting = numbers.stream()
                        .filter(a -> a > 10)
                                .sorted(Comparator.comparingInt(a -> a % 10));
        sorting.forEach(System.out::println); */ // enother case

           System.out.println(numb);
    }
}
