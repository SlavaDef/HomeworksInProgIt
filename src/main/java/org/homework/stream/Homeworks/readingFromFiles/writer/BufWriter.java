package org.homework.stream.Homeworks.readingFromFiles.writer;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BufWriter {

    public static void main(String[] args) {


        String parth = "C:/Users/Admin/Desktop/Files/";
        String str;

        try (BufferedReader intput = new BufferedReader(new FileReader(parth + "fileForReading/newFile.txt"));

             BufferedWriter output = new BufferedWriter(new FileWriter(parth + "fileForWriting/MyVeryNewText.txt"))) {

            int temp = 1;

            while ((str = intput.readLine()) != null) {
                // Запис рядка у файл:
                output.write("[" + temp + "] " + str.toLowerCase());
                // Перехід до нового рядка:
                output.newLine();
                // Нове значення для змінної-лічильника:
                temp++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such file");
        } catch (IOException e) {
            System.out.println("Помилка доступу до файлу: " + e);
        }
        IntStream rangeS = IntStream.range(9, 91);
      //  System.out.println(rangeS.collect(Collectors.<Object>toList()));

        Stream<Integer> generateStream = Stream.generate(() -> 5);
        System.out.println(generateStream);




    }



}
