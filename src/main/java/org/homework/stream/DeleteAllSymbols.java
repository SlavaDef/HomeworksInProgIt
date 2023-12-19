package org.homework.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Удалите из строки символы которые не являются буквами английского алфавита
public class DeleteAllSymbols {

    private final String str = "If yo*u prefer a tradition.al educa@tional route, you can earn a web development " +
            "ass$ociate degree, a bache$lor’s degre*e in web developm^ent or even a mas%%ter’s in web develop#ment.";

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {

        DeleteAllSymbols del = new DeleteAllSymbols();
        String[] words = del.getStr().split(" ");
        System.out.println(Arrays.toString(words));

        List<String> res = List.of(words);

        List<String> result = res.stream().map(a -> a.replaceAll("(?u)[^a-zA-z]", ""))
                .collect(Collectors.toList());
        System.out.println(result);

        StringBuilder builder = new StringBuilder();
        for (String word : result) {
            builder.append(word).append(" ");
        }
        System.out.println(builder);
    }
}
