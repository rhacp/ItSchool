package session6.challenges;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 3");
        System.out.println("---");
        System.out.println("");

        StringBuilder StringBuilder = new StringBuilder();
        StringBuilder valueToAdd = new StringBuilder("");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting string: ");
        StringBuilder.append(scanner.nextLine());
        System.out.println("");

        while (true) {
            System.out.println("Enter string to be added: ");
            System.out.println("(0 will stop the process and show the result)");
            valueToAdd.append(scanner.nextLine());
            System.out.println("");
            if (valueToAdd.toString().equals("0")) {
                break;
            }
            append(StringBuilder, valueToAdd);
            valueToAdd.setLength(0);
        }

        System.out.println("Final: " + StringBuilder);
    }

    public static void append(StringBuilder input, StringBuilder valueToAdd) {
        input.append(valueToAdd);
    }
}
