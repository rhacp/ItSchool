package session17_streams_optional_method_reference.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge04 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        printConcatenatedStrings(strings);
    }

    public static void printConcatenatedStrings(List<String> stringList) {
        String result = stringList.stream()
                .reduce("", (firstWord, secondWord) -> firstWord.equals("") ? secondWord : firstWord + "," + secondWord);

        String result2 = stringList.stream()
                .map(string -> string.equals("") ? string : string + ",")
                .collect(Collectors.joining());
        System.out.println(result);
        System.out.println(result2.substring(0, result2.length() - 1));
    }
}
