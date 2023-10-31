package session17_streams_optional_method_reference.challenge.challenge11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;

public class Challenge11 {

    public static void main(String[] args) throws IOException {
        Path textPath = Path.of("F:\\Coding\\Curs_Java\\LeetCode\\ItSchool\\src\\session17_streams_optional_method_reference\\challenge\\challenge11\\text.txt");
        String longestWord = getLongestWord(textPath);
        System.out.println(longestWord);
    }

    private static String getLongestWord(Path textPath) throws IOException {
        return Files.lines(textPath)
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .max(Comparator.comparing(String::length)).orElse("No string found.");
    }
}
