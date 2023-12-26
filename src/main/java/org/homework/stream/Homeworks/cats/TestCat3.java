package org.homework.stream.Homeworks.cats;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCat3 {

    public static void main(String[] args) {

        Cat cat4 = new Cat("Katy", "red", 7);
        Cat cat5 = new Cat(null, "white", 10); // !!!!!!!!!!!!!! якщо десь нул
        Cat cat6 = new Cat("Kisa", "black", 5);
        Cat cat7 = new Cat("Liza", "black&white", 6);

        List<Cat> catList = List.of(cat4, cat5, cat6, cat7);


        Stream<Cat> catToName = catList.stream()
                .filter(a -> a.getName().length() >= 4);
          //.filter(a -> a.getWeight() > 5); // фільтрів може бути декілька

        List<Cat> res = null;

        try { // обробка вийнятків здійснюється у термітних методах до null все буде фільтруватися
            res = catToName.collect(Collectors.toList());
        } catch (NullPointerException e) {
            System.out.println(e); // друк помилки
        }

        System.out.println(res);

    }
}
