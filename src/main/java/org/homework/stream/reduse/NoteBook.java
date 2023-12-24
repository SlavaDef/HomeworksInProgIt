package org.homework.stream.reduse;

import java.util.stream.Stream;

public class NoteBook {

    private String name;
    private int price;

    public NoteBook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }


    // знаходження сумми ціни ноутів у яких ціна менша нного значення reduse з трьома параметрами
    public static void main(String[] args) {

        Stream<NoteBook> noteBookStream = Stream.of(new NoteBook("HP", 12000),
                new NoteBook("LG", 10000),
                new NoteBook("Philips", 15000), new NoteBook("Dell", 8000));

        int sim = noteBookStream.reduce(0, (a, b) -> b.getPrice() > 10000 ? a + b.getPrice() : a,
                Integer::sum); // the same (a, b) -> a+b);

        System.out.println(sim);
    }
}
