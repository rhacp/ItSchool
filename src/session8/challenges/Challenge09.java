package session8.challenges;

import java.util.Scanner;

public class Challenge09 {

    public static void main(String[] args) {
        String number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your binary number: ");
        number = scanner.nextLine();
        while (!number.matches("[01]*")) {
            System.out.print("The number is not binary. Please enter it again: ");
            number = scanner.nextLine();
            System.out.println("");
        }
        scanner.close();

        convertBinaryToDecimal(number);
    }

    public static void convertBinaryToDecimal(String value) {
        int help = Integer.parseInt(value, 2);
        System.out.println("Your number converted to decimal is: " + help);
    }
}
