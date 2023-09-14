package session4.challenges;

import java.util.Scanner;

public class Challenge14 {

    public static void main(String[] args) {
        int counter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter counter value: ");
        counter = scanner.nextInt();
        System.out.println("");

        counter++;
        System.out.println("Counter + 1 = " + counter);
        System.out.println("");

        counter--;
        counter--;
        System.out.println("Counter - 1 = " + counter);
    }
}
