package session08_array_arraylist_linkedlist_wrapperclass.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 9, 4};

        sortArray(numbers);
        System.out.println("Printed array: " + Arrays.toString(numbers));
        System.out.println("Binary search index value: " + Arrays.binarySearch(numbers, 9));
        System.out.println("");

        String[][] names = {{"Ms", "Ms"}, {"John", "Alice"}};
        print2DArray(names);
        System.out.println("");

        int firstArrayNumber = numbers[0];
        System.out.println("First array number: " + firstArrayNumber);
        printArrayAverage(numbers);
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }

    public static void printArrayAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        int avg = sum / numbers.length;
        System.out.println("Arrays average: " + avg);
    }

    public static void print2DArray(String[][] names) {
        for (int index = 0; index < names.length; index++) {
            for (int secondIndex = 0; secondIndex < names[index].length; secondIndex++) {
                System.out.print(names[index][secondIndex] + " ");
            }
            System.out.println("");
        }
    }
}
