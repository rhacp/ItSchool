package session17_streams_optional_method_reference.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge13 {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        printProductOfNumbers(numbers);
    }

    private static void printProductOfNumbers(List<String> stringList) {
        int result = stringList.stream()
                .map(string -> Integer.valueOf(string))
                .reduce(1, (firstNumber, secondNumber) -> firstNumber * secondNumber);
        System.out.println("The product of numbers is: " + result);
    }
}
