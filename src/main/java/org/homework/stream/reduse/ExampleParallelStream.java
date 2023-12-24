package org.homework.stream.reduse;

import java.util.Arrays;
import java.util.List;

public class ExampleParallelStream { // parralel Streame

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Tom", "Bob", "Sam", "Kate", "Tim");

        list.stream().filter(a -> a.length() == 3).forEach(a -> System.out.println(a+" = first"));

        list.parallelStream().filter(a -> a.startsWith("T")).forEach(System.out::println);

        list.parallelStream().filter(a -> a.length()>3).forEach(a -> System.out.println(a+" = three"));

        list.parallelStream().sorted().forEachOrdered(System.out::println); // порядок в паралельном залишиться

        list.parallelStream().unordered().forEach(System.out::println); // відключення порядку


    }
}
