package org.homework.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Examples {

    public static void main(String[] args) {

        List<Integer> list = List.of(-4, 5, 12, -22, 0, 6);

        List<Integer> list2 = List.of(-4, 5, 12, 12, -22, 0, 6, 0, -4, 5);

        //  List<Integer> newList =
        list.stream()
                .filter(a -> (a > 0) & a != 12) // відфільтрує єлементи згідно лямдо виразу, дві умови
                .sorted((a, b) -> b - a) // відсортує від меншого до більшого sorted((a,b) -> b-a) навпаки
                // .collect(Collectors.toList()); // збере до колекції
                .forEach(System.out::println); // the same,  a -> System.out.println(a));

        //System.out.println(list); // вихідний лист
        // System.out.println(newList); // перероблений лист

        list2.stream().distinct().forEach(System.out::println); // distinct() delete dyblicates


    }
}
