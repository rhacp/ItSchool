package session4.challenges;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {
        int temperature;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        temperature = scanner.nextInt();

        System.out.println("");
        if (temperature > 30) {
            System.out.println("It is hot.");
        } else if (temperature > 20) {
            System.out.println("It is warm.");
        } else {
            System.out.println("It is cold.");
        }
    }
}
