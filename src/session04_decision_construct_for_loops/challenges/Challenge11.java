package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        int a, b, c, d, additionResult, multiplicationResult;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();
        System.out.print("d = ");
        d = scanner.nextInt();

        additionResult = a + b;
        multiplicationResult = c * d;

        System.out.println("");
        System.out.println("a + b = " + additionResult);
        System.out.println("c * d = " + multiplicationResult);
    }
}
