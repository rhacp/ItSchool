package session11_oop_abstraction.challenge.challenge07;

import java.util.Scanner;

public class App {

    //Still in progress.
    public static void main(String[] args) {
        UserList userlist = new UserList();
        HomeOwner homeOwner = new HomeOwner();
        homeOwner.setName("Default");
        homeOwner.setPassword("12345");
        homeOwner.setUserId();
        menu(userlist, homeOwner);
    }

    public static void menu(UserList userList, HomeOwner homeOwner) {
        Scanner scanner = new Scanner(System.in);
        int helpCounter;
        MENU_LOOP:
        while (true) {
            System.out.println("");
            System.out.println("PLEASE LOG IN FIRST");
            System.out.println("USERNAME: ");
            String username = scanner.nextLine();
            System.out.println("PASSWORD: ");
            String password = scanner.nextLine();
            while (userList.checkIfFamily(username, password) == false && userList.checkIfGuest(username, password) == false && userList.checkIfOwner(username, password) == false) {
                System.out.println("The account does not exist. Please try again.");
                System.out.println("Try \"Default\" and \"12345\"");
                System.out.println("");
                System.out.println("USERNAME: ");
                username = scanner.nextLine();
                System.out.println("PASSWORD: ");
                password = scanner.nextLine();
            }

            System.out.println("");
            System.out.println("Log in successful!");
            System.out.println("");
            System.out.println("MENU");
            System.out.println("---");
            System.out.println("Choose your item:");
            System.out.println("1. Create user.");
            System.out.println("2. Change user role (owner, family, guest).");
            System.out.println("3. Delete user.");
            System.out.println("4. Create new device.");
            System.out.println("5. Edit device details.");
            System.out.println("6. Delete device.");
            System.out.println("0. Exit.");
            System.out.println("");
            System.out.print("Choose the item by number: ");
            String secondHelpCounter = scanner.nextLine();
            while (!secondHelpCounter.matches("\\d+")) {
                System.out.print("Invalid input. Try again: ");
                secondHelpCounter = scanner.nextLine();
            }
            helpCounter = Integer.parseInt(secondHelpCounter);
            System.out.println("");

            switch (helpCounter) {
                case 1 -> {

                }
                case 2 -> {
                }
                case 0 -> {
                    break MENU_LOOP;
                }
            }
        }
    }
}
