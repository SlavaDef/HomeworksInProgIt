package org.homework.firstTask;

// Напишіть програму з класом, в якому є два числових поля і конструктори, які дозволяють створювати обьекти класу
// без передачі аргументів, з передачею одного аргументу і з передачею двох аргументів
public class WithConstruct {

    private double grivnes;

    private double dollars;

    public double getGrivnes() {
        return grivnes;
    }

    public void setGrivnes(double grivnes) {
        this.grivnes = grivnes;
    }

    public double getDollars() {
        return dollars;
    }

    public void setDollars(double dollars) {
        this.dollars = dollars;
    }

    public WithConstruct(){

    }

    public WithConstruct(double grivnes){

    }

    public WithConstruct(double grivnes, double dollars){

    }
}
