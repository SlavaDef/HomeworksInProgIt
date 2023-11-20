package org.homework.secondTasks.enimal;

public class Cat extends Animal {
    public Cat(String name, String color, double mass, int age) {
        super(name, color, mass, age);
    }

    @Override
    public String voice() {
        return "may-may";
    }

    @Override
    public void repeat(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(voice());
        }
    }

    @Override
    public double jump() {
        if(age < 1){
            return 0.5;
        } if((age >= 2) && (age <= 10)){
            return 4.5;
        }
        return 2.2;
    }
}
