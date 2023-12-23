package org.homework.stream.Homeworks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Разбейте строку английского текста по символу пробел. Полученный набор слов отсортируйте в
//порядке возрастания количества гласных букв в нем. Слова в которых нет гласных букв стоит
//исключить из результата.
public class StringSplit {

    private final String text = "Trump’s request to the gg US Supreme Court on Wednesday a was perhaps " +
            "his most brazen delay tactic yet llldfs";

    public String getText() {
        return text;
    }


    public int getCount(String s) {
        int count = 0;
        Character[] symbols = new Character[]{'a', 'e', 'i', 'o', 'u'};
        for (int k = 0; k < s.length(); k++) {
            for (Character character : symbols) {
                if (s.charAt(k) == character) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        StringSplit stringSplit = new StringSplit();

        List<String> res = Arrays.stream(stringSplit.getText().toLowerCase().split(" "))
                .filter(a -> a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u"))
                .sorted(Comparator.comparingInt(stringSplit::getCount))
                .collect(Collectors.toList());
        System.out.println(res);

    }
}
