package org.homework.stream.Homeworks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// На вход получаем путь к директории dir. Нужно получить List<String>, который содержит все имена
// файлов в данной директории. Если изначальная директория dir содержит в себе другие директории,
// то также нужно добавить имена файлов, содержащихся в них, в List. Сделать нужно через Stream API.
public class Main {

    public static List<String> getListWithNamesOfFiles(Path path) {
        try (Stream<Path> walk = Files.walk(path)) {
            return walk
                    .filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Could not read files for path " + path);
        }
    }

    public static void main(String[] args) throws Exception {
        Path path =
                Paths.get(
                        System.getProperty("user.dir"));
        System.out.println(
                String.join(
                        "\n",
                        getListWithNamesOfFiles(path)));
    }

}
