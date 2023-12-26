package org.homework.stream.Homeworks.cats;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCat2 {

    public static void main(String[] args) {
        Cat cat4 = new Cat("Katy", "red", 7);
        Cat cat5 = new Cat("Bob", "white", 10);
        Cat cat6 = new Cat("Kisa", "black", 5);
        Cat cat7 = new Cat("Myrka", "black&white", 6);

        List<Cat> catList = List.of(cat4, cat5, cat6, cat7);

        int weight = 5;

        Stream<String> catToName = catList.stream()
                .filter(a -> a.getWeight() >= weight)
                .map(Cat::getName); // the came map(a -> a.getName) змінює ніби тип данних

        List<String> res = catToName.collect(Collectors.toList()); // вийде лист імен
        System.out.println(res);


    }
}
