package session09_java_oop_concepts.challenges.challenge02;

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
//            System.out.println("2. Add a class to a student.");
            System.out.println("2. Add grade for a specific class for a student.");
            System.out.println("3. See all students and their grades (alphabetically).");
            System.out.println("4. See student average.");
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
                    System.out.print("Enter student name: ");
                    String nameValue = scanner.nextLine();
                    catalog.addStudent(new Student(nameValue));
                    catalog.getStudent(nameValue).setUUID();
                }
                case 2 -> {
                    System.out.print("Enter student to add class for: ");
                    String nameValue = scanner.nextLine();
                    System.out.print("Enter class to add the grade for: ");
                    String classValue = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    double gradeValue = Double.parseDouble(scanner.nextLine());
                    if (catalog.getStudent(nameValue) != null) {
                        catalog.getStudent(nameValue).addGrade(gradeValue, classValue);
                    }
                }
                case 3 -> {
                    catalog.showAllStudents();
                }
                case 4 -> {
                    System.out.print("Enter student to add class for: ");
                    String nameValue = scanner.nextLine();
                    System.out.println("The average between all grades is: " + catalog.getStudent(nameValue).averageGrade());
                }
                case 0 -> {
                    break MENU_LOOP;
                }
                default -> System.out.println("Not valid. Choose again your item.");
            }
        }
    }
}
