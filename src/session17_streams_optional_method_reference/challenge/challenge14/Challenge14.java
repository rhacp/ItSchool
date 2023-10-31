package session17_streams_optional_method_reference.challenge.challenge14;

import session17_streams_optional_method_reference.challenge.challenge14.models.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Challenge14 {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product("CPU", "Electronics", 2599.99),
                new Product("Orange", "Food", 25.05),
                new Product("Whiskey", "Drinks", 256.6),
                new Product("GPU", "Electronics", 2299.99),
                new Product("Memory", "Electronics", 399.36));
        printCategoryWithHighestAveragePrice(productList);
    }

    private static void printCategoryWithHighestAveragePrice(List<Product> productList) {
        int help = 1;
        Optional<Map.Entry<String, String>> result = productList.stream()
                .collect(Collectors.toMap(
                        element -> element.getCategory(),
                        element -> String.valueOf(element.getPrice()),
                        (element1, element2) -> (String.valueOf(element1) + " " + String.valueOf(element2))
                ))
                .entrySet().stream()
                .flatMap(str -> Arrays.stream(str.getValue().split(" ")))
                .toList().stream()
                .map(element -> Integer.valueOf(element))
                .mapToInt(Integer::intValue)
                .average()
        System.out.println("The Category with the highest average price is: " + result.get().getValue());
    }
}
