package session3.challenges;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 1");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber, secondNumber;
        firstNumber = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter second number:");
        secondNumber = scanner.nextInt();

        System.out.println("");
        System.out.println("Sum:" + (firstNumber + secondNumber));
        System.out.println("Dif:" + (firstNumber - secondNumber));
        System.out.println("Mult:" + (firstNumber * secondNumber));
        System.out.println("Div:" + (firstNumber / secondNumber));
        System.out.println("Mod:" + (firstNumber % secondNumber));


    }
}
