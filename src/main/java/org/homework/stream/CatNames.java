package org.homework.stream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CatNames {

    private static final String path = "C:\\Users\\Admin\\Desktop\\cat name.txt";

    public static void main(String[] args) throws IOException {
        try {
            Optional<String> result = Files.lines(Path.of(path))
                    .max(Comparator.comparingInt(String::length));
            System.out.println(result.get());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path path = Path.of("C:\\Users\\Admin\\Desktop\\Уроки Алишев и Hends for Java");

//List<String> resal =



       /* Path path = Path.of("C:\\Users\\Admin\\Desktop\\cat name.txt");
        List<String> list = Files.readAllLines(path);

        for (String str : list)
            System.out.println(str); */



        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path path2 : files)
                System.out.println(path2);
        }
    }
}
