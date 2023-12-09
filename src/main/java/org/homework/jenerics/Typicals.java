package org.homework.jenerics;

// Напишіть програму, в якій є узагальнений клас з одним узагальненим
//параметром. У цього класу є закрите поле, що посилається на масив з елементів
//узагальненого типу. Також мають бути методи, які за індексом повертають
//значення елемента з масиву, а також присвоюють значення елементу з вказаним
//індексом. Перевірити роботу об’єктів, створених на основі цього класу.
public class Typicals <T>{

    private final T [] arr;

    public Typicals(T[] arr) {
        this.arr = arr;
    }

    public T findElementInArray(int index){
        return arr[index];
    }
    public T initArrayByIndex(int index, T value){

      return   arr[index] = value;

    }

    public static void main(String[] args) {
        String [] arr = new String[5];
        Integer[] arrI = new Integer[5];
        Double[] arrD = new Double[5];

        Typicals<String> st = new Typicals<>(arr);
        Typicals<Integer> in = new Typicals<>(arrI);
        Typicals<Double> dob = new Typicals<>(arrD);

        st.initArrayByIndex(2,"hello");
        in.initArrayByIndex(3,88);
        dob.initArrayByIndex(0,3.14);

     String word =  st.findElementInArray(2);
     Integer number = in.findElementInArray(3);
     Double pi = dob.findElementInArray(0);

     System.out.println(word);
     System.out.println(number);
     System.out.println(pi);


    }


}
