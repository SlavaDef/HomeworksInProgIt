package org.homework.stream.Homeworks.readingFromFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Вычитайте из текстового файла адреса каталогов файловой системы. Верните первый
// из каталогов в котором расположено более 3-х текстовых файлов
public class ReadingFromFile {

    public static void main(String[] args) {

        File adr = new File("C:/Users/Admin/Desktop/Files/fileForWriting");
        List<File> direct = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(adr))) {
            String readed;
            while (((readed = br.readLine()) != null)) {
                direct.add(new File(readed));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Optional<File> optionalFile = direct.stream().filter(a -> find(Arrays.asList(a.listFiles())) > 2)
                .findFirst();
        System.out.println(optionalFile.get().getName());
    }

    public static int find(List<File> files) {
        int count = 0;
        for (File f : files) {
            if (f.getName().contains(".txt")) {
                count++;
            }
        }
        return count;
    }
}
