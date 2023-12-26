package org.homework.stream.Homeworks.cats;

public class Cat {

    private String name, color;

    private int weight;

    public Cat(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
      //  System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
      //  System.out.println(weight);
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String miau(){
        return "miau miau";
    }

    public void jump(){
        System.out.println("cat jump");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
