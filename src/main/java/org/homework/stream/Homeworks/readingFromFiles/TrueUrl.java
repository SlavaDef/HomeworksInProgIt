package org.homework.stream.Homeworks.readingFromFiles;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//   Создайте текстовый файл с url адресами. Используя Stream API выделите только те адреса
// которые являются доступными на текущий момент
public class TrueUrl {

    private static final String DIRECTORY = "./src/main/resources/forRidder/urlAdresses.txt";

    public void findValidUrl(List<String> lines){
        lines.stream()

                .filter(a -> {
                    try {
                        URL url = new URL(a);
                        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
                        if (huc.getResponseCode() == HttpURLConnection.HTTP_OK) {
                            return true;
                        }
                    } catch (UnknownHostException | MalformedURLException ignore) {

                    } catch (IOException | RuntimeException e) {
                        throw new RuntimeException(e);
                    }
                    return false;
                })
                .forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(DIRECTORY), StandardCharsets.UTF_8);
        new TrueUrl().findValidUrl(lines);

    }
}
