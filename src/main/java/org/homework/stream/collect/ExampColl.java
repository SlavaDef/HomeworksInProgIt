package org.homework.stream.collect;

import java.util.*;

// Используя Collector соберите в карту, только те слова в потоке строк, в которых есть гласные

public class ExampColl {

    public static void main(String[] args) {
        List<String> words = List.of("Arr", "hello", "word", "the", "apl", "o", "gopro", "SCS", "ftp", "OLP");
        Map<String, List<String>> result = words.stream()
                .collect(ExampColl::createMap, ExampColl::addToMap, ExampColl::mergeMap);
        System.out.println(result);
    }

    public static Map<String, List<String>> createMap() {
        Map<String, List<String>> map = new HashMap<>();
        map.put("Vowels", new ArrayList<>());

        return map;
    }

    public static void addToMap(Map<String, List<String>> map, String element) {
        element = element.toLowerCase();
        if (element.contains("a") || element.contains("e") || element.contains("i") || element.contains("o") || element.contains("u")) {
            map.get("Vowels").add(element);
        }
    }

    public static void mergeMap(Map<String, List<String>> map1, Map<String, List<String>> map2) {
        map2.forEach((k, v) -> map1.get(k).addAll(v));

    }
}

