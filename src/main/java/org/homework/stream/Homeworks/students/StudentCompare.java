package org.homework.stream.Homeworks.students;

import org.homework.stream.Homeworks.students.Students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Из массива студентов (да тех самых из основного в д.з) выберите студентов старше 20 лет, и
//отсортируйте их по фамилии. Результат поместите в список
public class StudentCompare {

    public static void main(String[] args) {

        Students[] students = {new Students("Bob", "It", 4, 21),
                new Students("Jane", "It", 4, 21),
                new Students("Sidney", "English", 4, 21),
                new Students("Klara", "Spanish", 2, 19),
                new Students("Arnold", "It", 5, 22)};

        List<Students> studentsList = Arrays.stream(students)
                .filter(a -> a.getAge() > 20)
                .sorted(Comparator.comparing(Students::getName))
                // or .sorted((a,b)-> a.getName().compareTo(b.getName()))
                .collect(Collectors.toList());
        System.out.println(studentsList);

    }


}
