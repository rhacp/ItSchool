package session3.challenges;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 3");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int firstNumber;
        firstNumber = scanner.nextInt();
        boolean negative = false;
        System.out.println("");
        if (firstNumber < 0)
            negative = !negative;
        System.out.println("Is the number negative?");
        System.out.println(negative);
    }
}
