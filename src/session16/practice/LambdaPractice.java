package session16.practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        IntMultiply getMultiply = (a, b) -> a * b;

        System.out.println("Sum: " + getSum.sum(10, 25));
        System.out.println("Multiply: " + getMultiply.multiply(20, 5));

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println("");

        //print names elements with lambda
        names.forEach(name -> System.out.println(name));

        System.out.println("");

        //print names elements with for
        for (String element : names) {
            System.out.println(element);
        }
    }
}
