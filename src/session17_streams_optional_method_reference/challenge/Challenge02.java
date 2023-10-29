package session17_streams_optional_method_reference.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Challenge02 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        printLongestString(strings);
    }

    private static void printLongestString(List<String> stringList) {
        Optional<String> result = stringList.stream()
                .reduce((firstWord, secondWord) -> firstWord.length() > secondWord.length() ? firstWord : secondWord);
        result.ifPresent(System.out::println);

        System.out.println("");

        String secondResult = stringList.stream()
                .reduce("", (firstWord, secondWord) -> firstWord.length() > secondWord.length() ? firstWord : secondWord);
        System.out.println(secondResult);
    }
}
