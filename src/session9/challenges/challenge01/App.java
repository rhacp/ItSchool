package session9.challenges.challenge01;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        int helpCounter;
        MENU_LOOP:
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("---");
            System.out.println("Choose your item:");
            System.out.println("1. Add student.");
            System.out.println("2. Add professor.");
            System.out.println("3. Add course.");
            System.out.println("4. Display all students.");
            System.out.println("5. Display all professors.");
            System.out.println("6. Display all courses.");
            System.out.println("7. Assign different professor to course.");
            System.out.println("0. Exit.");
            System.out.println("");
            System.out.print("Choose the item by number: ");
            helpCounter = Integer.parseInt(scanner.nextLine());

            switch (helpCounter) {
                case 1 -> {
                    System.out.print("Enter student first name: ");
                    String firstNameValue = scanner.nextLine();
                }
                case 0 -> {
                    break MENU_LOOP;
                }
            }
            }
    }
}
