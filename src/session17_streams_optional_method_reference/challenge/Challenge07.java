package session17_streams_optional_method_reference.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge07 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        System.out.println(strings);
        printStringLength(strings);
    }

    private static void printStringLength(List<String> stringList) {
        List<Integer> result = stringList.stream()
                .map(element -> element.length())
                .toList();
        System.out.println("Words length: " + result);
    }
}
