package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {
        int number;
        int rez = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        number = scanner.nextInt();

        System.out.println("");
        for (int index = number; index > 0; index--) {
            rez = rez * index;
        }
        System.out.println(number +  "! = " + rez);
    }
}
