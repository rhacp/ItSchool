package session05_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 12");
        System.out.println("");

        average();
    }

    public static void average() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int sum = 0;
        for (int index = 0; index < 10; index++) {
            System.out.print("Enter number " + (index + 1) + ": ");
            userInput = scanner.nextInt();
            if (userInput <= 5) {
                continue;
            }
            sum += userInput;
        }
        System.out.println("");
        System.out.println("The sum of numbers bigger than 10 is: " + sum);
    }
}
