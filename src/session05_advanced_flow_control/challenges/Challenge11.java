package session05_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 11");
        System.out.println("");

        average();
    }

    public static void average() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int sum = 0, helpContor = 0, average = 0;
        while (true) {
            System.out.print("Enter a number: ");
            userInput = scanner.nextInt();
            if (userInput != 0) {
                sum += userInput;
                helpContor++;
            } else {
                average = sum / helpContor;
                System.out.println("");
                System.out.print("The average of the numbers so far is: " + average);
                break;
            }
        }
    }
}
