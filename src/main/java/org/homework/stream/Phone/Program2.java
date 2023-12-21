package org.homework.stream.Phone;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {

    public static void main(String[] args) {

        Stream<Phone2> phoneStream = Stream.of(new Phone2("iPhone 8", 54000),
                new Phone2("Nokia 9", 45000),
                new Phone2("Samsung Galaxy S9", 40000),
                new Phone2("LG G6", 32000));


        Map<String, Integer> phones = phoneStream
                .collect(Collectors.toMap(Phone2::getName, Phone2::getPrice));
        // .collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));

        phones.forEach((k,v)->System.out.println(k + " " + v));
    }
}
class Phone2{

    private final String name;
    private final int price;

    public Phone2(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}
