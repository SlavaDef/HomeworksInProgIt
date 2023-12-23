package org.homework.stream.programLanguage;

import java.util.List;
import java.util.Optional;

public class TestProgramLanguage {

    public static void main(String[] args) {
        ProgrammingLanguage lang1 = new ProgrammingLanguage("Haskell", DifficultyLevel.HARD);
        ProgrammingLanguage lang2 = new ProgrammingLanguage("Python", DifficultyLevel.EASY);
        ProgrammingLanguage lang3 = new ProgrammingLanguage("Java", DifficultyLevel.MEDIUM);
        ProgrammingLanguage lang4 = new ProgrammingLanguage("C++", DifficultyLevel.HARD);
        ProgrammingLanguage lang5 = new ProgrammingLanguage("JS", DifficultyLevel.EASY);

        List<ProgrammingLanguage> languages = List.of(lang1, lang2, lang3, lang4, lang5);

        Optional<ProgrammingLanguage> result = languages.stream().max(TestProgramLanguage::compareHard);
        System.out.println(result.get());
    }
    public static int compareHard(ProgrammingLanguage a, ProgrammingLanguage b) {
        if (a.getComplexity().ordinal() > b.getComplexity().ordinal()) {
            return 1;
        }
        if (a.getComplexity().ordinal() < b.getComplexity().ordinal()) {
            return -1;
        }
        return Integer.compare(a.getName().length(), b.getName().length());
    }
}
