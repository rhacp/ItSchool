package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge19 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 19");
        System.out.println("---");
        System.out.println("");

        StringBuilder firstInputValue = new StringBuilder();
        StringBuilder patternValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        firstInputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.println("Your encoded string is: " + encoding(firstInputValue));
    }

    public static StringBuilder encoding(StringBuilder input) {
        StringBuilder rez = new StringBuilder();
        input.append(" ");
        char help = input.charAt(0);
        int counter = 0;
        for (int index = 0; index < input.length(); index++) {
            if (help == input.charAt(index)) {
                counter++;
            } else {
                rez.append(counter);
                rez.append(help);
                help = input.charAt(index);
                counter = 1;
            }
        }
        return rez;
    }
}
