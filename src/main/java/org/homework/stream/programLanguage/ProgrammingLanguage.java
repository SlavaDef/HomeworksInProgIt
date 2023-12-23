package org.homework.stream.programLanguage;

public class ProgrammingLanguage {

        private final String name;
        private final DifficultyLevel  complexity;
public ProgrammingLanguage(String name, DifficultyLevel complexity) {
            super();
            this.name = name;
            this.complexity = complexity;
        }
        public String getName() {
            return name;
        }
        public DifficultyLevel getComplexity() {
            return complexity;
        }
     /*   @Override
        public String toString() {
            return "ProgrammingLanguage [name=" + name + ", complexity=" + complexity + "]";
        } */

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                '}';
    }
}


