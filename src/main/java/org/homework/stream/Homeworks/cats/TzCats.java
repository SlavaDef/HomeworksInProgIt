package org.homework.stream.Homeworks.cats;

// Используя Stream API и List<Cat> верните самое длинное имя кота в этом списке.

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TzCats {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Katy99999", "grey", 7);
        Cat cat2 = new Cat("Bob658", "black", 10);
        Cat cat3 = new Cat("Zaza777", "white", 6);
        Cat cat4 = new Cat("Myrka", "black&white", 6);
        Cat cat5 = new Cat("Bolivia", "black&white", 6);

        List<Cat> catList = List.of(cat1, cat2, cat3, cat4, cat5);

        List<Cat> res = catList.stream()
        .max(Comparator.comparingInt(a -> a.getName().length()))
                .stream().collect(Collectors.toList());

       /* catList.stream()
                .max(Comparator.comparingInt(a -> a.getName().length())).ifPresent(a -> System.out.println(a.getName()));
*/
        System.out.println(res);

    }
}
