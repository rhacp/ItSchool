package session18.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem04 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("dog", "cat", "dog", "duck", "cat");
        Map<String, Long> duplicates = findDuplicates(strings);

        duplicates.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static Map<String, Long> findDuplicates(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
