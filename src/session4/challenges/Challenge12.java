package session4.challenges;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        int number, negativeNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = scanner.nextInt();
        negativeNumber = -number;

        System.out.println("");
        System.out.println("The opposite of " + number + " is: " + negativeNumber);
    }
}
