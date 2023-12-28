package org.homework.stream.Homeworks.readingFromFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

// На основе адреса каталога выделите список файлов с расширением «txt».
public class Txt {

    // шлях до певної директорії на компі
    private static final String PATH = "C:\\Users\\Admin\\Desktop\\Уроки Алишев и Hends for Java\\JAVA SE";

    // шлях до корнівої папки проєкту
    private static final String PATH_2 ="./src/main/resources/";


    public List<File> getAllTxt(String path) throws IOException {
        return Files.walk(Paths.get(path)) // з переданої строки отримуємо обьект Path
                .filter(Files::isRegularFile) // перевірка що це файл а не діректорія
                .filter(a -> a.toString().endsWith("txt"))
                .map(Path::toFile)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws IOException {

        new Txt().getAllTxt(PATH_2).stream().forEach(System.out::println);
    }
}
