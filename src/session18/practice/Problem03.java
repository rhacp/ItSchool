package session18.practice;

import java.util.*;

public class Problem03 {

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(2, 5, 6, 10);

        printMinAndMax(inputList);
    }

    private static void printMinAndMax(List<Integer> list) {
        OptionalInt min = list.stream()
                .mapToInt(Integer::intValue)
                .min();

        OptionalInt max = list.stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("Min: " + min.getAsInt());
        System.out.println("Max: " + max.getAsInt());
    }
}
