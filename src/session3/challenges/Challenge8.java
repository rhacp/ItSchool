package session3.challenges;

import java.util.Scanner;

public class Challenge8 {

        public static void main(String[] args) {
                System.out.println("CHALLENGE 8");
                System.out.println("");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first byte number: ");
                byte firstNumber, secondNumber;
                firstNumber = scanner.nextByte();
                System.out.println("");
                System.out.println("Enter second byte number:");
                secondNumber = scanner.nextByte();

                System.out.println("");
                byte rezult;
                rezult = (byte) (firstNumber + secondNumber);
                System.out.println("The sum of the two byte numbers is: " + rezult);
        }
}
