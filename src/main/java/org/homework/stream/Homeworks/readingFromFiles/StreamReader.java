package org.homework.stream.Homeworks.readingFromFiles;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Вычитайте из текстового файла адреса каталогов файловой системы. Верните первый
//  из каталогов в котором расположено более 3-х текстовых файлов
public class StreamReader {

    private static final String DIRECTOR = "C:\\Users\\Admin\\Desktop\\Files";

    public static void main(String[] args) throws IOException {

      /*  Files.walk(Paths.get(DIRECTOR)) // з переданої строки отримуємо обьект Path
                .filter(Files::isRegularFile) // перевірка що це файл а не діректорія
                .filter(a -> a.toString().endsWith("txt"))
               // .filter(a -> a.getFileName())
                .limit(3)
                .map(Path::toFile)
                .forEach(System.out::println);
        // .collect(Collectors.toList());


        File folder = new File(DIRECTOR);
        for (File file : folder.listFiles())
        {
            System.out.println(file.getName());
        } */

      Stream<Path> filelist =  Files.walk(Paths.get(DIRECTOR))
                .filter(Files::isDirectory);


                //.map(Path::getFileName)
               // .filter(a -> a.toString().endsWith("txt"))
               // .filter(a -> a.toString().length()>3)
               // .forEach(System.out::println);

        filelist
              //  .map(a -> a.)
                        .forEach(System.out::println);

        filelist.forEach(System.out::println);


    }
}
