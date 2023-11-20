package org.homework.secondTasks.paralepiped;

public class Calculating extends Parallelepipedon {

    public Calculating(double width, double depth, double height) {
        super(width, depth, height);
    }

    public Calculating() {
    }

    private double mass;

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double findDensity(double mass) { // густина density

        return mass / volume();

    }

    public double weightReduction(int times) { // зменшення маси у times разів
        double result = mass / times;

        if (result < 0 || times < 0) {
            throw new ArithmeticException("Error, it is imposible");
        }
        System.out.println("mass have been changed" + result);


        return result;
    }

    public static Calculating createNew(Calculating calculating, Calculating calculating1){

      Calculating calculating2 = new Calculating();
      calculating2.volume = calculating.volume() + calculating1.volume();
      calculating2.mass = calculating.mass+calculating1.mass;

      return calculating2;

    }

    @Override
    public String toString() {
        return "new object has mass = " + mass+ " and volume = "+ volume;
    }
}
