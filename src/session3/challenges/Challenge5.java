package session3.challenges;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 5");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int firstNumber, secondNumber;
        firstNumber = scanner.nextInt();

        System.out.println("");
        firstNumber += 2;
        firstNumber -= 3;
        firstNumber *= 5;
        firstNumber /= 9;
        firstNumber %= 10;
        System.out.println("((number + 2 - 3) * 5 / 9) % 10 = " + firstNumber);
    }
}
