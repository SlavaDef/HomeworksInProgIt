package org.homework.stream.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
                new Phone("Pixel 2", "Google", 500),
                new Phone("iPhone 8", "Apple",450),
                new Phone("Nokia 9", "HMD Global",150),
                new Phone("Galaxy S9", "Samsung", 300));

        phoneStream.sorted(new PhoneComparator())
                .forEach(p->System.out.printf("%s (%s) - %d \n",
                        p.getName(), p.getCompany(), p.getPrice()));

        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6); // числа перемножаються по черзі
        Optional<Integer> result = numbersStream.reduce((x, y)->x*y);
        System.out.println(result.get()); // 720

        ArrayList<Integer> numbers = new ArrayList<>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println(min.orElseGet(()->rnd.nextInt(100))); // random do 100 якщо нема мінімуму
        System.out.println(new Random().nextInt(200));

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        Optional<Integer> min2 = numbers2.stream().min(Integer::compare);
        min2.ifPresentOrElse(
                v -> System.out.println(v), // якщо числа нема то альтернативний запис
                () -> System.out.println("Value not found")
        );

    }
}
class PhoneComparator implements Comparator<Phone> {

    public int compare(Phone a, Phone b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}
