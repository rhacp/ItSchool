package session04_decision_construct_for_loops.practice;

import java.util.Scanner;

public class DecisionConstruct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The nummber is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        char character = 'c';
        if (Character.isUpperCase(character)) {
            System.out.println("It is an upper case letter.");
        } else if (Character.isLowerCase(character)){
            System.out.println("It is an lowercase letter.");
        } else if (Character.isDigit(character)) {
            System.out.println("It is a digit.");
        } else {
            System.out.println("It is a special  character.");
        }
    }
}
