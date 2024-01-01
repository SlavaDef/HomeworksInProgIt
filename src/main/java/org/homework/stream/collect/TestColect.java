package org.homework.stream.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestColect {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> even = list1.stream()
                .filter(a->a%2==0)
                .collect(ArrayList::new, (a,b)->a.add(b), (a,b)->a.addAll(b));
        //.collect(Collectors.toList()); // the same

        System.out.println(even);


    }
}
