package session18.chellenge.challenge12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Challenge12 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cow", "porcupine", "chicken", "duck");
        System.out.println(getProcessedList(strings));
    }

    private  static <T extends String> List<T> getProcessedList(List<T> string) {
        return (List<T>) string.stream()
                .filter(word -> word.length() > 5)
                .map(word -> word.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
