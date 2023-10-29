package session17_streams_optional_method_reference.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge01 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        printEvenNumbers(numbers);
    }

    private static void printEvenNumbers(List<Integer> integerList) {
        List<Integer> resultList = integerList.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        System.out.println("Even numbers from the list: " + resultList);
    }
}
