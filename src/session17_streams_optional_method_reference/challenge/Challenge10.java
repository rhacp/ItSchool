package session17_streams_optional_method_reference.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Challenge10 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        printNumberOfCharacters(strings);
    }

    private static void printNumberOfCharacters(List<String> stringList) {
        int result = stringList.stream()
                .map(string -> string.replace(" ", ""))
                .map(String::length)
                .reduce(0, (firstNumber, secondNumber) -> firstNumber + secondNumber);
        System.out.println("Number of characters in list: " + result);
    }
}
