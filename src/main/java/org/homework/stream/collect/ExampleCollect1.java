package org.homework.stream.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleCollect1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3"); // edd our elements in collection

        System.out.println(list);

        String res = list.stream().collect(Collectors.joining(", "));
        System.out.println(res);

        // Преобразование потока в мэп
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "a=2", "b=3", "c=4", "d==3");

        Map<String, String> result = list2.stream()
                .map(e -> e.split("=")) // ==[a,2]+[b,3]+[c,4]+[d,=3]
                .filter(e -> e.length == 2)// minus [d,=3]
                .collect(Collectors.toMap(e -> e[0], e -> e[1])); // e[0] = a, e[1] = 2 ....

        System.out.println(result); // {a=2, b=3, c=4}
        System.out.println(result.get("a")); // 2,  a=kay
        System.out.println(result.values()); // [2, 3, 4]

        ArrayList<Integer> list3 = new ArrayList<>();

        Collections.addAll(list3, 22, 2, 55, 66, 76, 54, 12, 34, 9, 7, 2, 55, 7);

        System.out.println(list3);

    }

}
