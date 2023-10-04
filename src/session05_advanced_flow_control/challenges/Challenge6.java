package session05_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 6");
        System.out.println("");

        System.out.println("");
        System.out.print("The sum of your numbers is: " + printSumOfNumbers());
    }

    public static int printSumOfNumbers() {
        int number = 0, sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (number != -1) {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            sum += number;
        }
        return (sum + 1);
    }
}
