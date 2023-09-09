package session3.challenges;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 10");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int firstNumber, helpNumber;
        firstNumber = scanner.nextInt();
        helpNumber = firstNumber;

        System.out.println("");
        System.out.println("Your number incremented by one is: " + (++firstNumber));
        System.out.println("Your number decremented by one is: " + (--helpNumber));
    }
}
