package session6.challenges;

import java.util.Scanner;

public class Challenge02 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 2");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new  StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.print("Is your String palindrome? " +  checkIfStringIsPalindrome(inputValue) + ".");
    }

    public static boolean checkIfStringIsPalindrome(StringBuilder  input) {
        StringBuilder helpStringBuilder = new StringBuilder(input);
        helpStringBuilder.reverse();
        System.out.println(input);
        System.out.println(helpStringBuilder);
        if ((helpStringBuilder.toString()).equals(input.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
