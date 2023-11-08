package org.homework.firstTask;

public class Symbols {

    private char first;

    private char second;

    public char getFirst() {
        return first;
    }

    public void setFirst(char first) {
        this.first = first;
    }

    public char getSecond() {
        return second;
    }

    public void setSecond(char second) {
        this.second = second;
    }

    public void setter() {
        first = '*';
        second = '0';

    }

    public void setter(char first, char second) {
        this.first = first;
        this.second = second;

    }

    public void setter(char first) {
        this.first = first;
        second = '$';


    }


}
