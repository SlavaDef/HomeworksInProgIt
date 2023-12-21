package org.homework.stream.Homeworks;

// Удалите из List<Cat> всех кошек вес которых меньше 3 кг, отсортируйте их по именам
//   (в лексикографическом порядке) и соберите результат в новый список Cat.

import org.homework.stream.cats.Cat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TzCats2 {

    public static void main(String[] args) {
        Cat cat10 = new Cat("Katy", "grey", 7);
        Cat cat20 = new Cat("Bob", "black", 2);
        Cat cat30 = new Cat("Zaza", "white", 8);
        Cat cat40 = new Cat("Ayrkova", "black&white", 6);
        Cat cat50 = new Cat("Bolivia", "black", 1);

        List<Cat> catList = List.of(cat10, cat20, cat30, cat40, cat50);

        List<Cat> newCats = catList.stream()
                .filter(a -> a.getWeight() > 3)
                .sorted(Comparator.comparing(Cat::getName))
                .collect(Collectors.toList());

        System.out.println(newCats);
    }
}
