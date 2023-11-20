package org.homework.secondTasks.differentTask;


// Напишіть програму з класом, в якому є цілочислове
//поле. Створіть масив таких об'єктів. Поля об'єктів
//заповніть випадковими числами. Опишіть статичний
//метод, який в масиві об'єктів знаходить об'єкт з
//найбільшим значенням поля і повертає результатом текст
//з інформацією про індекс об'єкту і значення його полів
public class Stars {

    private int distanseInMiles;

    public Stars(int distanseInMiles) {
        this.distanseInMiles = distanseInMiles;
    }

    public int getDistanseInMiles() {
        return distanseInMiles;
    }



    public Stars[] inizialized(Stars[] stars) {
         stars = new Stars[getDistanseInMiles() * 2];
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Stars( getDistanseInMiles() * 100 * 5);
        }
        return stars;
    }

    static void findTheBiggestStar(Stars[] stars){





    }

 /*   public static void main(String[] args) {
        Stars stars = new Stars(12);

      stars.inizialized(stars);

        for (int s: stars){

        }

    }
*/

}
