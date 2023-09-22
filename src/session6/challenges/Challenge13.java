package session6.challenges;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Challenge13 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 13");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your compressed String name: ");
        inputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.println("Decompressed String: " + decompressString(inputValue));
    }

    public static StringBuilder decompressString (StringBuilder input) {
        StringBuilder rez = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            if (isDigit(input.charAt(index))){
                for (int indexSecond = Character.getNumericValue(input.charAt(index)); indexSecond > 0; indexSecond--) {
                    rez.append(input.charAt(index - 1));
                }
            }
        }
        return rez;
    }
}
