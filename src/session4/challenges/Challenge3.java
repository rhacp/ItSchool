package session4.challenges;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        System.out.println("");
        if (age >= 18) {
            System.out.println("I am adult.");
        } else {
            System.out.println("I am not adult.");
        }
    }
}
