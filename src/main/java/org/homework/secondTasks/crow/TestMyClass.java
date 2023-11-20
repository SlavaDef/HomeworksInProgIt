package org.homework.secondTasks.crow;

import static org.homework.secondTasks.crow.MyClass.first;
import static org.homework.secondTasks.crow.MyClass.second;

public class TestMyClass {

    public static void main(String[] args) {
        Alfa alfa = new MyClass();
        first((MyClass) alfa);
        Bravo bravo = new MyClass();
        second((MyClass) bravo);

    }
}
