package lesson_36;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<String> {
    @Override
    public boolean test(String string) {
        return string.startsWith("J");
    }
}
