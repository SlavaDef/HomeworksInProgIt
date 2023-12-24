package org.homework.stream.reduse;

import java.util.List;
import java.util.Optional;

//Замените с помощью метода reduce терминальный метод max
public class ChangeMaxByReduce {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(66, 24, -8, 55, 1, 22, 79, 67, 88);
        Optional<Integer> result = numbers.stream().reduce((a, b) -> a > b ? a : b);
        System.out.println(result.get());


    }
}
