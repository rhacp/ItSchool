package session06_core_java_apis.challenges;

import java.util.Scanner;

import static java.lang.Character.*;

public class Challenge16 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 16");
        System.out.println("---");
        System.out.println("");

        StringBuilder firstInputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        firstInputValue.append(scanner.nextLine());

        System.out.println(" ");
        System.out.println("Result: " + toggleCase(firstInputValue));
    }

    public static StringBuilder toggleCase (StringBuilder input) {
        StringBuilder rez = new StringBuilder();
        int helpCounter = 0;
        input.append("a");
        for (int index = 0; index < input.length(); index++) {
            if (isUpperCase(input.charAt(index))) {
                rez.append(input.substring(helpCounter, index).toUpperCase());
                helpCounter = index;
            } else if (isLowerCase(input.charAt(index))) {
                rez.append(input.substring(helpCounter, index).toLowerCase());
                helpCounter = index;
            } else if (input.charAt(index) == ' ') {
                rez.append(input.charAt(index));
            }
        }
        return rez;
    }
}
