package org.homework.stream.cats;

import java.util.List;
import java.util.stream.Stream;


public class TestCatWithPeek {

    // peek може вносити зміни в колекцію на основі лямда виразів, не видаляти
    public static void main(String[] args) {

        Cat cat4 = new Cat("Kity", "red", 7);
        Cat cat5 = new Cat("Arni", "white", 10);
        Cat cat6 = new Cat("Kisa", "black", 5);
        Cat cat7 = new Cat("Liza", "black&white", 6);

        List<Cat> catList = List.of(cat4, cat5, cat6, cat7);

        Stream<Cat> catToName = catList.stream()
                .filter(a -> a.getWeight() > 5)
                .peek(a -> a.setName("Cat_" + a.getName())); // peek внесе зміни до колекції за допомогою set
        //    .peek(a -> a.setWeight(a.getWeight()+1));

        catToName.forEach(System.out::println);
        System.out.println();

        for (Cat cat : catList) {
            System.out.println(cat);
        }


    }
}
