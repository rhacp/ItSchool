package session17_streams_optional_method_reference.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamPractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> string = Arrays.asList("apple", "banana", "peach", "watermelon");
        List<Product> products = Arrays.asList(new Product("Phone", 999.9987), new Product("Laptop", 2499.9987), new Product("Gadget", 450.25));
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4, 5),
                Arrays.asList(2, 3, 4, 5, 6),
                Arrays.asList(3, 4, 5, 6, 7));

//        printEvenNumbers(numbers);
//        printEvenNumbersWithStream(numbers);

//        printStringByLengthBiggerThan(string, 5);
//        printStringLength(string);

//        printProductPrices(products);

//        printProductsIncreasedPrices(products);

//        printFlatMap(listOfLists);

//        sumOfNumbers(numbers);

//        printSortedProductByPrice(products);

//        printProcessedNumbers(numbers);

        printProcessedStrings(string);
    }

    /***
     * List of strings. Get only the ones that have a length greater than 5 and also starts with 'a'.
     */

    private static void printProcessedStrings(List<String> stringList) {
        boolean anyMatch = stringList.stream()
                .filter(fruit -> fruit.length() > 5)
                .anyMatch(fruit -> fruit.startsWith("a"));
        System.out.println("Is there any fruit with length greater than 5 and that starts with 'a'?" + " " + anyMatch);
    }

    /***
     * You have a list of integers. Your task is to filter the even numbers, square them, and then print each squared value that is greater than 20 using the forEach terminal operation.
     */

    private static void printProcessedNumbers(List<Integer> integerList) {
        integerList.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .filter((number -> number > 20))
                .forEach(System.out::println);
    }

    /***
     * You have a list of Product objects, where each Product has a name and a price. Your task is to sort the products in ascending order based on their prices and print the sorted list.
     */

    private static void printSortedProductByPrice(List<Product> productList) {
        List<Product> sortedProducts = productList.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .toList();
        sortedProducts.forEach(product -> System.out.println(product.getName() + " " + product.getPrice()));
    }

    private static void sumOfNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);
    }

    private static void printFlatMap(List<List<Integer>> listOfLists) {
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println("Flattened list: " + flattenedList);
    }

    private static void printProductsIncreasedPrices(List<Product> productList) {
        List<String> formattedPrices = productList.stream()
                .map(product -> product.getPrice() * 1.10)
                .map(newPrice -> "$" + String.format("%.2f", newPrice))
                //printeaza cu doua zecimale
                .toList();
        System.out.println("Increased prices: " + formattedPrices);
    }

    private static void printProductPrices(List<Product> productList) {
        productList.stream()
                .map(Product::getPrice)
                .forEach(System.out::println);
    }

    /***
     * Write a Java program using streams to map a list of strings to a list of integers representing the length of each string.
     */
    private static void printStringLength(List<String> stringList) {
        List<Integer> resultList = stringList.stream()
                .map(String::length)
                .toList();
        System.out.println("The length of the strings: " + resultList);
    }

    private static void printStringByLengthBiggerThan(List<String> inputList, int minLength) {
        List<String> filteredStrings = new ArrayList<>();
        for (String element : inputList) {
            if (element.length() > minLength) {
                filteredStrings.add(element);
            }
        }
        System.out.println("Traditional approach: " + filteredStrings);

        List<String> filterStringsLambda = inputList.stream()
                .filter(element -> element.length() > minLength)
                .toList();
        System.out.println("Stream approach: " + filterStringsLambda);
    }

    private static void printEvenNumbersWithStream(List<Integer> numbers) {
        // stream approach
        List<Integer> evenNumbersStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Stream approach: " + evenNumbersStream);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        //traditional approach
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("Traditional approach: " + evenNumbers);
    }
}
