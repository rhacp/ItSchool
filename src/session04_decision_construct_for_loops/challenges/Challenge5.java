package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        int maxValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum value: ");
        maxValue = scanner.nextInt();

        System.out.println("");
        System.out.println("All even numbers smaller than " + maxValue + " are:");
        for (int index = 1; index < maxValue; index += 2) {
            System.out.print(index + " ");
        }
    }
}
