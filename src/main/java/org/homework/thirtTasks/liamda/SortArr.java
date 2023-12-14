package org.homework.thirtTasks.liamda;

import java.util.Arrays;

public class SortArr {


    public static void main(String[] args) {

        String [] names = new String[]{"Fredi", "Sidney", "Boby", "Givi", "J_n_T_jonson"};

        Arrays.sort(names, (a,b) -> a.length()-b.length()); // from small to big

        System.out.println(Arrays.toString(names));

        Arrays.sort(names, (a,b) -> b.length()-a.length()); // from big to small

        System.out.println(Arrays.toString(names));

        Arrays.sort(names, (a,b) -> a.charAt(0)-b.charAt(0)); // from first letter

        System.out.println(Arrays.toString(names));

        Arrays.sort(names, (a,b) -> a.charAt(a.length()-1)-b.charAt(b.length()-1)); // from last letter

        System.out.println(Arrays.toString(names));




    }
}
