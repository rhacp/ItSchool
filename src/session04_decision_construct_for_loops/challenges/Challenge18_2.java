package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge18_2 {

    public static void main(String[] args) {
        int age, helpContor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.println("");

        helpContor = (age < 12) ? 0 : (age <= 17) ? 1 : (age <= 64) ? 2 : 3;
        switch (helpContor) {
            case 0:
                System.out.println("You're a child.");
                break;
            case 1:
                System.out.println("You're a teenager.");
                break;
            case 2:
                System.out.println("You're an adult.");
                break;
            case 3:
                System.out.println("You're a senior.");
                break;
        }
    }
}
