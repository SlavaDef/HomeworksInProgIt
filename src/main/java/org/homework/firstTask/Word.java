package org.homework.firstTask;

// Написати програму з класом в якому є символьне поле і метод, який повертає значення  код символу
public class Word {

    private char word = '$';

    public char getWord() {
        return word;
    }

    public void setWord(char word) {
        this.word = word;
    }

    public int print(){
        int resalt = word;
        return resalt;
    }
}
