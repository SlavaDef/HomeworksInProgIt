package org.homework.secondTasks.differentTask;

// Напишіть програму з класом, в якому є два поля (символьне і цілочислове) і метод,
// аргументом якому передається об'єкт того ж класу. При виклику методу об'єкту, з
// якого викликається метод, присвоюються значення полів об'єкта, переданого
// аргументом методу. У об'єкта, переданого аргументом методу, значення полів
// збільшуються на одиницю

public class Students {

    public Students(Character group, int studentCount) {
        this.group = group;
        this.studentCount = studentCount;
    }

    Character group;

    int studentCount;


    public void change(Students students) {
        Students students1 = new Students('C', 33);
        System.out.println("Before changes first object = " + students);
        System.out.println("Before changes second object = " + students1);
        students.group = students1.group;
        students.studentCount = students1.studentCount;
        System.out.println("After changes first object = " + students);
        students1.group++;
        students1.studentCount++;
        System.out.println("After changes second object = " + students1);
    }


    @Override
    public String toString() {
        return "Students{" +
                "group=" + group +
                ", studentCount=" + studentCount +
                '}';
    }


    public static void main(String[] args) {
        Students students = new Students('D', 21);
        students.change(students);
    }
}
