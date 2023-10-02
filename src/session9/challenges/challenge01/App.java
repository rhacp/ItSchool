package session9.challenges.challenge01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        menu(catalog);
    }

    public static void menu(Catalog catalog) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        int helpCounter;
        MENU_LOOP:
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("---");
            System.out.println("Choose your item:");
            System.out.println("1. Add a student.");
            System.out.println("2. Add a professor.");
            System.out.println("3. Add a course.");
            System.out.println("4. Display all students.");
            System.out.println("5. Display all professors.");
            System.out.println("6. Display all courses.");
            System.out.println("7. Assign different professor to course.");
            System.out.println("8. Remove a student.");
            System.out.println("9. Remove a professor.");
            System.out.println("10. Remove a course.");
            System.out.println("0. Exit.");
            System.out.println("");
            System.out.print("Choose the item by number: ");
            helpCounter = Integer.parseInt(scanner.nextLine());
            System.out.println("");

            switch (helpCounter) {
                case 1 -> {
                    System.out.print("Enter student first name: ");
                    String firstNameValue = scanner.nextLine();
                    System.out.print("Enter student last name: ");
                    String lastNameValue = scanner.nextLine();
                    System.out.print("Enter student gender: ");
                    String sexValue = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int ageValue = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter date of birth (YYYY-MM-DD): ");
                    LocalDate dateOfBirthValue = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.print("Enter student CNP: ");
                    long cnpValue = Long.parseLong(scanner.nextLine());
                    System.out.print("Enter student address: ");
                    String addressValue = scanner.nextLine();
                    catalog.addStudent(new Student(firstNameValue, lastNameValue, sexValue, ageValue, dateOfBirthValue, cnpValue, addressValue));
                }
                case 3 -> {
                    System.out.print("Enter the course type (Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History): ");
                    String typeValue = scanner.nextLine();
                    while (typeValue != "Math"&& typeValue != "Computer Science" && typeValue != "Physics" && typeValue != "Chemestry" && typeValue != "Biology" && typeValue != "Geography" && typeValue != "English" && typeValue != "History") {

                    }
                }
                case 4 -> catalog.showAllStudents();
                case 0 -> {
                    break MENU_LOOP;
                }
            }
            }
    }
}
