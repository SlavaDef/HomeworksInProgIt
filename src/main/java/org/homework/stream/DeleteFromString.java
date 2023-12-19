package org.homework.stream;

// Удалите из строки текста все слова длиннее 5 символов

// Удалите из строки символы которые не являются буквами английского алфавита

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeleteFromString {

    private final String text = "From e-commerce to streaming, companies’ success largely depends on their website " +
            "experience. As more of our lives move online, demand for web developers is expected to increase by 30% " +
            "from 2021 to 2031, the U.S. Bureau of Labor Statistics reports.";

    private final String textSecond = "Front-end deveлoper*s creaтe a smooтh, eng*aging weбsite that stays consiсtent " +
            "across mobiлe and weб applicat&ions and even diффerent broуsers";

    public String getText() {
        return text;
    }

    public String getTextSecond() {
        return textSecond;
    }

    public static void main(String[] args) {

        DeleteFromString deleter = new DeleteFromString();
        String word = deleter.getText();
        String[] result = word.replace(",", "").replace(".", "").split(" ");

        System.out.println("Before = " + Arrays.toString(result));

        Stream<String> newWords = Arrays.stream(result).filter(a -> a.length() <= 5);
        newWords.forEach(System.out::println);

        // another case
        List<String> newWords2 = List.of(result);

        List<String> res = newWords2.stream().filter(a -> a.length() <= 5).collect(Collectors.toList());

        System.out.println(res);
        System.out.println("-------------------------------------------------------------------------");

        // second Task
        String second = deleter.getTextSecond();
        String[] wor = second.replace(",","").split(" ");
        List<String> wor2 = List.of(wor);

        System.out.println(wor2);
        //(?u)[^a-zA-z]    [А-я,а-я]
        List<String> task = wor2.stream()
                .map(a -> a.replaceAll("(?u)[^a-zA-z]","_")) // "" to delete all symbols
                .collect(Collectors.toList());


        System.out.println(task);
    }
}
