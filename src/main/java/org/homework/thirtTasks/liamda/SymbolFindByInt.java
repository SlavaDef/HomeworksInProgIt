package org.homework.thirtTasks.liamda;


//Напишіть програму, в якій має бути функціональний інтерфейс. Абстрактний
//метод функціонального інтерфейсу має такі характеристики: у нього два
//аргументи (типу String та типу int) і результатом він повертає значення типу char.
//Створіть змінну інтерфейсного типу, і як значення присвойте цій змінній лямбдавираз такий, щоб метод з
// функціонального інтерфейсу результат розраховував
//так: з тексту, переданого першим аргументом методу, повертається символ з
//індексом, який визначається другими аргументом методу.


interface Functional {

    char symbolic(String word, int number);
}

public class SymbolFindByInt {

    public static void main(String[] args) {

        Functional f = String::charAt;

        // Another case

       /* Functional f2 = (word,n) -> {
          return word.charAt(n);
        }; */

           // audit
        String word ="Sehenswürdigkeiten";
        int wordNumber = 6;

        char res = f.symbolic(word,wordNumber);
        System.out.println(res);
    }
}
