package org.homework.secondTasks.enimal;

public class Dog extends Animal {
    public Dog(String name, String color, double mass, int age) {
        super(name, color, mass, age);
    }

    @Override
  public String voice() {
        return "gav-gav";
    }

    @Override
    public void repeat(int times) {
        for (int i = 0; i < times; i++){
           System.out.println( voice());
        }
    }

    @Override
   public double jump() {

        if(age < 2){
            return 0.5;
        } if((age >= 2) && (age <= 6)){
            return 2.5;
        }
        return 1.2;
    }
}
