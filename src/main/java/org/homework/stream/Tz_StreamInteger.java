package org.homework.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Tz_StreamInteger {

    // Используя Stream API и List<Integer> выделите только нечетные числа, отсортируйте их
    //по возрастанию и соберите в новый список.

    public static void main(String[] args) {

        List<Integer> numbers = List.of(22, 45, 12, 43, 13, 99, 66, 49, 3);

        List<Integer> newNumbers = numbers.stream()
                .filter(a -> a % 2 != 0).sorted().collect(Collectors.toList());

        System.out.println(newNumbers);

    }
}
