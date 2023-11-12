package org.homework.secondTasks;

import static org.homework.secondTasks.Students.change;

public class TestMethod {

    public static void main(String[] args) {

     /*   FirstClass firstClass = new FirstClass(55);
        SecondClass secondClass = new SecondClass('R');

        secondClass.method(firstClass);
        System.out.println(secondClass.getCumb());  */


        Students students = new Students('A', 44);
         change(students);
        // System.out.println(students);

    }
}
