package org.homework.random;

public class TestRandom {

    public static <T extends Comparable<T>> T findMin(T[] arr) {
        T min = arr[0];
        for (T elemtnt : arr) {
            if (min.compareTo(elemtnt) > 0) {
                min = elemtnt;
            }
        }

        return min;
    }


    public static void main(String[] args) {

        // return min from all massive

        Double[] ar = new Double[]{2.44, 2.55, -5.5, -8.2, 33.4};
        Double min = findMin(ar);
        System.out.println(min);
        String[] words = new String[]{"helo", "in", "sky"};
        String m = findMin(words);
        System.out.println(m);

        // return random numbers in diapozon from 0 to 1000 with + and -
        for (int i = 0; i < 10; i++) {
            System.out.print("|" + (int) (Math.random() * (-1000)));
            System.out.print("|" + (int) (Math.random() * 1000));
        }
        System.out.println();
        StringModify str = String::toUpperCase; // the same s -> s.toUpperCase()
        System.out.println(str.getString("Hello")); // виклик методу інтерфейсу з параметрами

        IntCount count = Integer::sum; // the seme is (a,b) -> a+b
        System.out.println(count.getNewInt(34,22)); // виклик методу інтерфейсу з параметрами



    }
}

@FunctionalInterface
interface StringModify {
     String getString(String text);

}

interface IntCount {
     int getNewInt(int a, int b);
}
