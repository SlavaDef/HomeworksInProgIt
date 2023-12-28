package org.homework.stream.Homeworks.readingFromFiles.writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

//Используя Stream API верните адрес файла с максимальным размером в заданном
//каталоге.

public class MaxSizeOfTheFile {

    private static final String DIR = "./src/main/resources/";

    public Optional<Path> findMaxSizeOfTheFile(String directory) throws IOException {
        return Files.walk(Paths.get(directory))
                .filter(Files::isRegularFile)
                .reduce((a, b) -> a.toString().length() > b.toString().length() ? a : b);
    }

    public static void main(String[] args) throws IOException {

        new MaxSizeOfTheFile().findMaxSizeOfTheFile(DIR).ifPresent(System.out::print);

    }
}
