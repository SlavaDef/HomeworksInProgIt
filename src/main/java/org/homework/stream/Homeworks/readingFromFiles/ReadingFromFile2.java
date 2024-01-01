package org.homework.stream.Homeworks.readingFromFiles;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.nio.file.Path;

// Вычитайте из текстового файла адреса каталогов файловой системы. Верните первый
//из каталогов в котором расположено более 3-х текстовых файлов
public class ReadingFromFile2 {

    private static final String DIR = "C:\\Users\\Admin\\Desktop\\Files";

    public Optional<String> directoryFindTxt(String directory) throws IOException {
       return Files.walk(Paths.get(directory))
                .map(Path::toString)
                .filter(dir -> {
                    try {
                        long count = Files.list(Paths.get(dir))
                                .filter(files -> files.toString().endsWith("txt"))
                                .count();
                        return count > 3;
                    } catch (IOException e) {
                        return false;
                    }
                }).findFirst();
    }

    public static void main(String[] args) throws IOException {

        new ReadingFromFile2().directoryFindTxt(DIR).ifPresent(System.out::println);


    }
}
