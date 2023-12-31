package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge17 {

    public static void main(String[] args) {
        boolean hasUsername, hasPassword;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a username?");
        hasUsername = scanner.nextBoolean();
        System.out.println("");
        System.out.println("Do you have a password?");
        hasPassword = scanner.nextBoolean();
        System.out.println("");

        if (hasUsername == true && hasPassword == true) {
            System.out.println("Authentication successful.");
        } else if (hasUsername == false && hasPassword == false) {
            System.out.println("Authentication failed.");
        } else if (hasUsername == true && hasPassword == false) {
            System.out.println("Password is incorrect.");
        } else {
            System.out.println("Username is incorrect.");
        }
    }
}
