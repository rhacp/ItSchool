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

        helpContor = (score <= 59 && score >= 0) ? 'F' : (score <= 69 && score >= 0) ? 'D' : (score <= 79 && score >= 0) ? 'C' : (score <= 89 && score >= 0) ? 'B' : (score <= 100 && score >= 0) ? 'A' : 'N';
        if (helpContor == 'N') {
            System.out.println("The input was bigger than 100 or smaller than 0, which is not possible.");
        } else {
            System.out.println("Your grade is: " + helpContor);
        }
    }
}
