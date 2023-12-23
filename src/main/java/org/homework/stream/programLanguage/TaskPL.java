package org.homework.stream.programLanguage;


import java.util.List;
import java.util.Optional;

// Реализуйте возможность выбора из списка языков программирования (пример в лекции)
//язык с заданной сложностью обучения. Верните любой из обладающих нужной
//сложностью. Тоб то  отримати першу мову програмування з заданим критеріем - enams HARD or MEDIUM or EASY

public class TaskPL {

    public static Optional<ProgrammingLanguage> chooseLanguage(DifficultyLevel level,
                                                               List<ProgrammingLanguage> languages) {

        return languages.stream()
                .filter(a -> a.getComplexity().equals(level)).findFirst();
    }

    public static void main(String[] args) {


        List<ProgrammingLanguage> languages = List.of(
                new ProgrammingLanguage("C++", DifficultyLevel.HARD),
                new ProgrammingLanguage("Python", DifficultyLevel.EASY),
                new ProgrammingLanguage("Java", DifficultyLevel.MEDIUM),
                new ProgrammingLanguage("Haskell", DifficultyLevel.HARD),
                new ProgrammingLanguage("JS", DifficultyLevel.EASY),
                new ProgrammingLanguage("Rubbi", DifficultyLevel.EASY),
                new ProgrammingLanguage("Paskal", DifficultyLevel.MEDIUM));

        System.out.println(chooseLanguage(DifficultyLevel.HARD, languages));

    }
}


