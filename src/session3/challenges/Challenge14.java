package session3.challenges;

import java.util.Scanner;

public class Challenge14 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 14");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int firstNumber, startRange, endRange;
        firstNumber = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter the start of your range: ");
        startRange = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter the end of your range: ");
        endRange = scanner.nextInt();
        System.out.println("");

        if (firstNumber >= startRange && firstNumber <= endRange)
            System.out.println("Your number is within the specified range.");
        else
            System.out.println("Your number is not within the specific range.");
    }
}
