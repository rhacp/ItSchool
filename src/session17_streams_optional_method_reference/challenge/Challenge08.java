package session17_streams_optional_method_reference.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Challenge08 {

    public static void main(String[] args) {
        String sentence = "Hello World!aa";
        printVowelsNumber(sentence);
    }

    private static void printVowelsNumber(String input) {
        Stream<Character> characterStream = input.chars()
                .mapToObj(c -> (char) c);

        long result = characterStream
                .filter(c -> ("AEIOUaeiou".indexOf(c) != -1))
                .count();

        //Dictionary
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        int result2 = (int)Arrays.stream(input.toLowerCase().split(""))
                .filter(vowels::contains)
                .count();

        System.out.println("Number of vowels: " + result);
        System.out.println(result2);
    }
}
