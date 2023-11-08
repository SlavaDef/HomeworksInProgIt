package org.homework.firstTask;

public class Hello {

    private char word = '$';

    public char getWord() {
        return word;
    }

    public void setWord(char word) {
        this.word = word;
    }

    public char print(){
        return getWord();
    }
}
