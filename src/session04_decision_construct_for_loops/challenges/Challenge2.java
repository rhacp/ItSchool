package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        secondNumber = scanner.nextInt();

        System.out.println("");
        if (firstNumber == secondNumber) {
            System.out.println("The number are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }

        Scanner scannerString = new Scanner(System.in);
        System.out.println("");
        String firstString;
        String secondString;
        System.out.println("Enter your first string:");
        firstString = scannerString.nextLine();
        System.out.println("Enter your second string:");
        secondString = scannerString.nextLine();

        System.out.println("");
        if (firstString.equals(secondString) == true) {
            System.out.println("Your strings are the same.");
        } else {
            System.out.println("Your strings are not the same.");
        }
    }
}
