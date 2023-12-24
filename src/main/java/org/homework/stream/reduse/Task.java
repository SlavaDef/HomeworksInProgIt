package org.homework.stream.reduse;

// Используя reduce верните произведение элементов потока полученных на основании
// списка целых чисел.

import java.util.Optional;
import java.util.stream.Stream;

public class Task {

    public static void main(String[] args) {

        Stream<Integer> numb = Stream.of(2, 5, 12, 12, -5, -12, 1, 13, 99);


        Optional<Integer> result = numb.reduce((a, b) -> a * b);

     //   long res = numb.reduce(1, (a, b) -> a * b); // another case without Optional
        result.ifPresent(System.out::println);

       // System.out.println(res);

    }
}
