package org.homework.secondTasks.paralepiped;

import static org.homework.secondTasks.paralepiped.Calculating.createNew;

public class TestApp {

    public static void main(String[] args) {

        Calculating calculating = new Calculating(20.5, 33.5, 12.1);
        Calculating calculating2 = new Calculating(27.5, 35.5, 22.1);

        calculating.setMass(10);
        calculating2.setMass(20);

       // System.out.println( "First volume = " + calculating.volume() + " mass = " + calculating.getMass());
       // System.out.println("Second volume = " + calculating2.volume() + " mass = " + calculating2.getMass());


           System.out.println( createNew(calculating,calculating2));
    }
}
