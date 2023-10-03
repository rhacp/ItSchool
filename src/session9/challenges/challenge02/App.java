package session9.challenges.challenge02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        menu(catalog);
    }

    public static void menu(Catalog catalog) {
        Scanner scanner = new Scanner(System.in);
        int helpCounter;
        MENU_LOOP:
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("---");
            System.out.println("Choose your item:");
            System.out.println("1. Add a student.");
            System.out.println("2. Add a class to a student.");
            System.out.println("3. Add grade for a specific class for a student.");
            System.out.println("4. See all students and their grades.");
            System.out.println("0. Exit.");
            System.out.println("");
            System.out.print("Choose the item by number: ");
            helpCounter = Integer.parseInt(scanner.nextLine());
            System.out.println("");

            switch (helpCounter) {
                case 1 -> {
                    System.out.print("Enter student name: ");
                    String nameValue = scanner.nextLine();
                    catalog.addStudent(new Student(nameValue));
                    catalog.getStudent(nameValue).setUUID();
                }
                case 2 -> {
                    System.out.println("Enter student to add class for: ");
                    String nameValue = scanner.nextLine();
                    System.out.println("Enter class to add: ");
                    String classValue = scanner.nextLine();
                    catalog.getStudent(nameValue).addClass(classValue);
                }
            }
        }
    }
}
