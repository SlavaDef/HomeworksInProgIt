package org.homework.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Ниже приведен фрагмент XML документа (pom.xml — используется в Maven для указания
//зависимостей) Поместите эти строки в массив строк, создайте поток на его основе и выделите значения в
// теге <groupid> и соберите результат в список строк
public class TzStr {

    public static void main(String[] args) {

        String[] str = {"<dependency>", "<groupId>junit</groupId>", "<artifactId>junit</artifactId>",
                "<version>4.4</version>", "<scope>test</scope>", "</dependency>", "<dependency>",
                "<groupId>org.powermock</groupId>", "<artifactId>powermock-reflect</artifactId>",
                "<version>3.2</version>", "</dependency>"};

        System.out.println(Arrays.toString(str));

        Stream<String> res = Arrays.stream(str)
                .filter(a->a.contains("groupId"))
                .map(a->a.replaceAll("<groupId>",""))
                .map(a->a.replaceAll("</groupId>",""));

        List<String> result = res.collect(Collectors.toList());
        System.out.println(result);
    }
}
