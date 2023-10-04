package session06_core_java_apis.challenges;

import java.util.Scanner;

import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;

public class Challenge12 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 12");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your camel-case variable name: ");
        inputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.println("Your variable name in snake-case is: " + camelToSnake(inputValue));
    }

    public static StringBuilder camelToSnake(StringBuilder input) {
        StringBuilder rez = new StringBuilder();
        input.append('A');
        int helpContor = 0;
        for (int index = 0; index  < input.length(); index++) {
            if (isUpperCase(input.charAt(index))) {
                rez.append(input.substring(helpContor, index).toLowerCase());
                rez.append("_");
                helpContor = index;
            }
        }
        rez.deleteCharAt(rez.length() - 1);
        return rez;
    }
}
