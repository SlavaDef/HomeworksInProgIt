package org.homework.stream.reduse;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.BinaryOperator;

//Разбейте строку английского текста по символу пробел. Используя reduce верните суммарное
//количество букв в словах длинна которых превышает 4
public class TaskWithReduse {

    public String getText() {
        return "The whale has lived in captivity in a South Korean mega-mall aquarium for nearly" +
                " a decade. Activists are battling to get her moved to an ocean sanctuary for a chance at a new life";
    }

    public static void main(String[] args) {

        TaskWithReduse task = new TaskWithReduse();

        BinaryOperator<String> bop = (a, b) -> a + b;

        Optional<String> res = Arrays.stream(task.getText().toLowerCase().replace(".", "")
                        .split(" "))
                .filter(a -> a.length() > 4)
                .reduce(bop);
        res.ifPresent(b -> System.out.println(b.length()));

    }
}
