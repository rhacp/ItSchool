package session4.challenges;

import java.util.Scanner;

public class Challenge20 {

    public static void main(String[] args) {
        double score;
        char helpContor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        score = scanner.nextDouble();
        System.out.println("");

        helpContor = (score <= 59) ? 'F' : (score <= 69) ? 'D' : (score <= 79) ? 'C' : (score <= 89) ? 'B' : (score <= 100) ? 'A' : 'N';
        if (helpContor == 'N') {
            System.out.println("The input was bigger than 100 which is not possible.");
        } else {
            System.out.println("Your grade is: " + helpContor);
        }
    }
}
