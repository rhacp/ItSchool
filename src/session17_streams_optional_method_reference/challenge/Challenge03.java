package session17_streams_optional_method_reference.challenge;

import java.util.ArrayList;
import java.util.List;

public class Challenge03 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int index = 1; index < 101; index++) {
            numbers.add(index);
        }
        printPrimeNumbers(numbers);
    }

    private static void printPrimeNumbers(List<Integer> integerList) {
        List<Integer> result = integerList.stream()
                .filter(number -> checkPrime(number))
                .toList();

        System.out.println("Prime numbers: " + result);
    }

    private static boolean checkPrime(int number) {
        if (number <= 1)
            return false;

        if (number == 2 || number == 3)
            return true;

        if (number % 2 == 0 || number % 3 == 0)
            return false;

        for (int i = 5; i < Math.sqrt(number); i = i + 6)
            if (number % i == 0 || number % (i + 2) == 0)
                return false;

        return true;
    }
}
