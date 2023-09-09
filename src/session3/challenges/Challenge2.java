package session3.challenges;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 2");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber, secondNumber;
        firstNumber = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter second number:");
        secondNumber = scanner.nextInt();
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            System.out.println("First number ++: " + (++firstNumber));
            System.out.println("Second number --: " + (--secondNumber));
            System.out.println("Now lets go on!");
            System.out.println("");
        }
    }
}
