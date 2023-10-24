package session16.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static jdk.dynalink.linker.support.Guards.isArray;

public class LambdaStringModifier {

    public static void main(String[] args) {
        Function<String, Integer> stringLengthFinder = str -> str.length();
        System.out.println("String length: " + stringLengthFinder.apply("Happy Friday"));

        List<String> myList = Arrays.asList("Bob", "Alice", "Tailor");
        //with streams and lambda
        myList.stream()
                .filter(name -> name.startsWith("8"))
                .forEach(System.out::println);

        //without lambda
        for(String name: myList) {
            if (name.startsWith("8")) {
                System.out.println(name);
            }
        }
    }
}
