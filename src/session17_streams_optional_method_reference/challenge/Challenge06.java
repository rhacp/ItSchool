package session17_streams_optional_method_reference.challenge;

import java.util.Arrays;
import java.util.List;

public class Challenge06 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 100);
        integerSum(integerList);
    }

    private static void integerSum(List<Integer> integerList) {
        int result = integerList.stream()
                .reduce(0, (firstNumber, secondNumber) -> firstNumber + secondNumber);

        int reuslt2 = integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + result);
        System.out.println(reuslt2);
    }
}
