package session5.challenges;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 1");
        System.out.println("");

        int numberValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        numberValue = scanner.nextInt();

        System.out.println("");
        System.out.print("Your number is: " + checkEvenOrOdd(numberValue));

    }

    public static String checkEvenOrOdd(int number) {
        String rez;
        if (number % 2 == 0) {
            rez = "Even";
        } else {
            rez = "Odd";
        }
        return rez;
    }
}
