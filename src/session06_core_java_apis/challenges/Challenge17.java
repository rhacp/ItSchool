package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge17 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 17");
        System.out.println("---");
        System.out.println("");

        StringBuilder firstInputValue = new StringBuilder();
        StringBuilder secondInputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first String: ");
        firstInputValue.append(scanner.nextLine());
        System.out.println("");
        System.out.print("Enter your second String: ");
        secondInputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.println("Result: " + interleavesStrings(firstInputValue, secondInputValue));
    }

    public static StringBuilder interleavesStrings(StringBuilder firstInput, StringBuilder secondInput) {
        StringBuilder rez = new StringBuilder();
        int helpCounter = 0;
        if (firstInput.length() <= secondInput.length()) {
            for (int index = 0; index < firstInput.length(); index++) {
                rez.append(firstInput.toString().charAt(index));
                rez.append(secondInput.toString().charAt(index));
                helpCounter = index;
            }
            rez.append(secondInput.substring(helpCounter + 1, secondInput.length()));
        } else {
            for (int index = 0; index < secondInput.length(); index++) {
                rez.append(firstInput.toString().charAt(index));
                rez.append(secondInput.toString().charAt(index));
                helpCounter = index;
            }
            rez.append(secondInput.substring(helpCounter + 1, firstInput.length()));
        }
        return rez;
    }
}
