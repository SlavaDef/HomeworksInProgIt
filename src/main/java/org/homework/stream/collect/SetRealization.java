package org.homework.stream.collect;

import java.util.HashSet;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collector;

// Используя Collector напишите свою реализацию метода Collectors.toSet()
public class SetRealization implements Collector<String, Set<String>, Set<String>> {
    private final Predicate<String> toUpper;

    public SetRealization(Predicate<String> toUpper) {
        super();
        this.toUpper = toUpper;
    }

    @Override
    public Supplier<Set<String>> supplier() {
        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<String>, String> accumulator() {
        return (a, b) -> {
            if (toUpper.test(b)) {
                a.add(b);
            }
        };
    }

    @Override
    public BinaryOperator<Set<String>> combiner() {
        return (a, b) -> {
            Set<String> result = new HashSet<>();
            result.addAll(a);
            result.addAll(b);
            return result;
        };
    }

    @Override
    public Function<Set<String>, Set<String>> finisher() {
        return HashSet::new;

    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }

    public static void main(String[] args) {
        Set<String> set = Set.of("Miles", "Bob", "Kate", "Sidney", "Helga", "Arni");
        Predicate<String> predicate = (a) -> a.length() > 3;
        Collector<String, Set<String>, Set<String>> collector = new SetRealization(predicate);
        Set<String> result = set.stream().collect(collector);
        System.out.println(result);
    }
}
