package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge19 {

    public static void main(String[] args) {
        int a, b, c;
        char helpContor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        System.out.println("");

        helpContor = (a > b && a > c) ? 'a' : (b > a && b > c) ? 'b' : 'c';
        System.out.println("The biggest number is: " + helpContor);
    }
}
