package org.homework.secondTasks.enimal;

public class TestAnimals {

    public static void main(String[] args) {
        Dog dog = new Dog("Fred", "gray", 15.4, 7);
        dog.show();
       System.out.println(dog.jump());
       System.out.println(dog.voice());
       dog.repeat(1);
       Cat cat = new Cat("Kity", "white", 8.5, 5);
       cat.show();
       cat.voice();
       cat.repeat(4);
       System.out.println(cat.name+" can jump on "+ cat.jump()+ " meters");

    }
}
