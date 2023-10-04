package session03_java_operators.challenges;

import java.util.Scanner;

public class Challenge13 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 13");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial price: ");
        int initialPrice, discountPercent;
        initialPrice = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter the discount percent value:");
        discountPercent = scanner.nextInt();
        System.out.println("");

        initialPrice -= initialPrice * discountPercent / 100;
        System.out.println("The final price is: " + initialPrice);
    }
}
