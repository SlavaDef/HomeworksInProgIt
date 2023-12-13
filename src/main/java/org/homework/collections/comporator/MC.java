package org.homework.collections.comporator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class MC implements Comparator {

    public int compare(Object a, Object b) {
        int x, y;
        x = (Integer) a / 10 % 10;
        y = (Integer) b / 10 % 10;
        return x - y;
    }
}

class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int[] n = {350, 140, 530, 220, 410};
// int [] n={300,100,500,200,400};
        for (int k = 0; k < n.length; k++) {
            nums.add(n[k]);
        }
        System.out.println(nums);
        TreeSet<Integer> A = new TreeSet<>(nums);
        System.out.println(A);
// Використання компаратора:
        TreeSet<Integer> B = new TreeSet<>(new MC());
        B.addAll(nums);
        System.out.println(B);
    }
}
