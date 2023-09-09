package session3.challenges;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 6");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber, secondNumber;
        firstNumber = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter second number:");
        secondNumber = scanner.nextInt();

        System.out.println("");
        if (firstNumber > secondNumber)
            System.out.println("The first number is bigger.");
        else if (secondNumber > firstNumber)
            System.out.println("The second number is bigger.");
        else
            System.out.println("The numbers are equal.");
    }
}
