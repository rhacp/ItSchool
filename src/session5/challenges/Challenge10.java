package session5.challenges;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 10");
        System.out.println("");

        System.out.println("Menu Options:");
        System.out.println("- Print \"Hello World\"");
        System.out.println("- Print the user's name.");
        System.out.println("- Exit.");
        System.out.println("");

        menuBackEnd();

    }

    public static void menuBackEnd() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            System.out.print("Enter one of the menu options: ");
            userInput = scanner.nextLine();
            switch (userInput) {
                case "Print \"Hello World\"": {
                    System.out.print("Hello World");
                    break;
                }
                case "Print the user's name.": {
                    System.out.print("Andrei");
                    break;
                }
                case "Exit.":
                    System.out.print("Menu closed.");
                    break;
                default:
                    System.out.print("The input is not in the menu.");
                    break;
            }
            System.out.println("");
            System.out.println("");
        } while (!"Exit.".equals(userInput));
    }
}
