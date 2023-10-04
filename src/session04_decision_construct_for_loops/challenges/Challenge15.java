package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge15 {

    public static void main(String[] args) {
        int total;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total value: ");
        total = scanner.nextInt();
        System.out.println("");

        total -= 20;
        System.out.println("total - 20 = " + total);
        System.out.println("");

        total *= 2;
        System.out.println("total * 2 = " + total);
    }
}
