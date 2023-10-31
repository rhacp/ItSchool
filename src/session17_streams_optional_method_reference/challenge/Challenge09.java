package session17_streams_optional_method_reference.challenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge09 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello world", "Hello everyone", "Lambda Expression");
        genericName(strings);
    }

    private static void genericName(List<String> listOfLists) {
        Optional<Map.Entry<String, Integer>> helpMap = listOfLists.stream()
                //                Splituim stringurile dupa " "
                .flatMap(str -> Arrays.stream(str.split(" ")))
//                Punem cuvantul ca cheie si punem aparitiile.
                .collect(Collectors.groupingBy(str -> str))
                .entrySet().stream()
//                Punem elementele intr un map de String si Integer
                .collect(Collectors.toMap(
                        element -> element.getKey(),
                        element -> element.getValue().size()
                ))
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));

        System.out.println(helpMap.get());
    }
}
