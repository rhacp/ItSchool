package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge18 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 18");
        System.out.println("---");
        System.out.println("");

        StringBuilder firstInputValue = new StringBuilder();
        StringBuilder patternValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        firstInputValue.append(scanner.nextLine());
        System.out.print("Enter your pattern: ");
        patternValue.append(scanner.nextLine());
        System.out.println("");
        int help = findPattern(firstInputValue, patternValue);

        if (help > 1) {
            System.out.println("The pattern was identified " + help + " times.");
        } else {
            System.out.println("The pattern does not repeat in your string.");
        }
    }

    public static int findPattern(StringBuilder input, StringBuilder pattern) {
        input.append(" ");
        int count = 0;
        for (int index = 0; index < input.length() - pattern.length(); index++) {
            int secondIndex = index + pattern.length();
            if (input.substring(index, (index + pattern.length())).toString().equals(pattern.toString())) {
                count++;
            }
        }
        return count;
    }
}
