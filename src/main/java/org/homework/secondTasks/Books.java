package org.homework.secondTasks;


// ● Напишіть програму з класом, в якому є поле -
//цілочисловий масив. Опишіть перевантажений статичний
//метод, котрий на основі об'єкта даного класу повертає
//копію масиву (з даного об'єкта), а на основі переданого
//аргументом масиву створює об'єкт відповідного класу
public class Books {

    int[] numbers;

    public Books(int[] numbers) {

        this.numbers = numbers;
    }

    static int[] copy(Books books) {


        int[] newNumbers = new int[books.numbers.length];

        for (int i = 0; i < newNumbers.length; i++) {
            newNumbers[i] = books.numbers[i];
            System.out.print(newNumbers[i] + " = " + books.numbers[i] + " ");
        }
        return newNumbers;
    }

    static Books copy(int[] books) {
        return new Books(books);
    }

}
