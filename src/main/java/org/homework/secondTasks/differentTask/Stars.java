package org.homework.secondTasks.differentTask;


// Напишіть програму з класом, в якому є цілочислове
//поле. Створіть масив таких об'єктів. Поля об'єктів
//заповніть випадковими числами. Опишіть статичний
//метод, який в масиві об'єктів знаходить об'єкт з
//найбільшим значенням поля і повертає результатом текст
//з інформацією про індекс об'єкту і значення його полів
public class Stars {

    private int distanseInMiles;

    Stars[] stars;

    public Stars(int distanseInMiles) {
        this.distanseInMiles = distanseInMiles;
    }

    public Stars[] inizialized(int length) {
        stars = new Stars[length];
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Stars((distanseInMiles + i) * 100 * 5);
        }
        return stars;
    }

    static void findTheBiggestStar(Stars[] stars) {
        int temp = 1;
        int temp2 = 0;
        for (int i = 0; i < stars.length; i++) {
            if (stars[i].distanseInMiles > temp) {
                temp = stars[i].distanseInMiles;
                temp2 = i;
            }
        }
        System.out.println("The biggest star hes index " + temp2 + ", with distanse in " + temp + "km");
    }

    public static void main(String[] args) {
        Stars stars = new Stars(12);
        Stars[] stars1 = stars.inizialized(10);
        findTheBiggestStar(stars1);
    }
}
