package session3.challenges;

import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 9");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length, width;
        length = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter the width of the rectangle:");
        width = scanner.nextInt();
        System.out.println("");

        System.out.println("The area of the rectangle is: " + (length * width));
    }
}
