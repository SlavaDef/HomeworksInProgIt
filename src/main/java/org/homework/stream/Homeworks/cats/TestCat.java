package org.homework.stream.Homeworks.cats;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCat {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Katy", "grey", 7);
        Cat cat2 = new Cat("Bob", "black", 10);
        Cat cat3 = new Cat("Zina", "white", 5);
        Cat cat4 = new Cat("Myrka", "black&white", 6);

        List<Cat> catList = List.of(cat1, cat2, cat3, cat4);

        int age = 5;

        List<Cat> res = catList.stream()  // створили новий список котів
                .filter(a -> a.getWeight() > age)
                .collect(Collectors.toList());

        Stream<Cat> catStream = catList.stream()
                        .filter(a -> a.getName().length() > 3);

        List<Cat> cats = catStream.collect(Collectors.toList());

        System.out.println(res);

        System.out.println(cats);
    }
}
