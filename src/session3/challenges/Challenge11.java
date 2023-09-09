package session3.challenges;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 2");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first bool: ");
        boolean firstBool, secondBool;
        firstBool = scanner.nextBoolean();
        System.out.println("");
        System.out.println("Enter second bool:");
        secondBool = scanner.nextBoolean();
        System.out.println("");

        System.out.println("The negation of your first statement is: " + (!firstBool));
        System.out.println("The negation of your first statement is: " + (!secondBool));
    }
}
