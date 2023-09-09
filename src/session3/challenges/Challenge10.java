package session3.challenges;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 10");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int firstNumber;
        firstNumber = scanner.nextInt();

        System.out.println("");
        System.out.println("The reverse of your number is: " + (-firstNumber));
    }
}
