package org.homework.stream.reduse;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.file.Path;

public class WithBigInteger {

    public static void main(String[] args) throws IOException {

        BigInteger numb = BigInteger.valueOf(5);
        BigInteger numb2 = BigInteger.valueOf(5);

        numb = numb.multiply(numb2);
        System.out.println(numb);


        Stream<Integer> stream = Stream.of(224444444, 333333, 14, 19);

        // List<BigInteger> list = stream.map(a -> a.m)



      //  new WithBigInteger().processFilesFromFolder(new File("C:\\Users\\Admin\\Desktop\\Files"));
    }

    public void processFilesFromFolder(File folder) {
        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries) {
            if (entry.isDirectory()) {
                processFilesFromFolder(entry);
                continue;
            }
            // иначе вам попался файл, обрабатывайте его!
        }
    }
}
