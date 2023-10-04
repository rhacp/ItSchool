package session05_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 7");
        System.out.println("");
        int number = 100, userNumber;
        boolean helpChecker;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Guess the number: ");
            userNumber = scanner.nextInt();
            helpChecker = checkNumber(number, userNumber);
            System.out.println("");
            System.out.println("");
        } while (helpChecker != true);
    }

    public static boolean checkNumber(int number, int userNumber) {
        boolean helpChecker;
        if (number == userNumber) {
            helpChecker = true;
            System.out.print("You guessed the number!");
        } else if (number > userNumber){
            helpChecker = false;
            System.out.print("Your guess is too low! Try again.");
        } else {
            helpChecker = false;
            System.out.print("Your guess is too high! Try again.");
        }
        return helpChecker;
    }
}
