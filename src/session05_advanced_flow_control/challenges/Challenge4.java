package session05_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 4");
        System.out.println("");

        String inputValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        inputValue = scanner.nextLine();

        System.out.println("");
        System.out.print("Your reversed string is: ");
        reverseString(inputValue);
    }

    public static void reverseString(String input) {
        for (int index = input.length() - 1; index >= 0; index--) {
            System.out.print(input.charAt(index));
        }
    }
}
