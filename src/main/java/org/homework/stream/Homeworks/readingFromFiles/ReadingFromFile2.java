package org.homework.stream.Homeworks.readingFromFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.nio.file.Path;

// Вычитайте из текстового файла адреса каталогов файловой системы. Верните первый
//из каталогов в котором расположено более 3-х текстовых файлов
public class ReadingFromFile2 {

    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Admin/Desktop/Files/fileForWriting.txt");

        Optional<String> firstDirectory = Files.lines(Paths.get(String.valueOf(file)))
                .map(Paths::get)
                .map(Path::toString)
                .filter(directory -> {
                    try {
                        long countFiles = Files.list(Paths.get(directory))
                                .filter(files -> files.toString().endsWith(".txt"))
                                .count();
                        return countFiles > 3;
                    } catch (IOException e) {
                        return false;
                    }
                })
                .findFirst();
        System.out.println(firstDirectory.get());
    }
}
