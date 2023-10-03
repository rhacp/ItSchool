package session9.challenges.challenge01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        CourseList list = new CourseList();
        ProfessorList professorList = new ProfessorList();
        menu(catalog, professorList, list);
    }

    public static void menu(Catalog catalog, ProfessorList professorList, CourseList list) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
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
            System.out.println("4. Display all students (alphabetically).");
            System.out.println("5. Display all professors (alphabetically).");
            System.out.println("6. Display all courses.");
            System.out.println("7. Assign different professor to course.");
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
                case 2 -> {
                    System.out.print("Enter professor first name: ");
                    String firstNameValue = scanner.nextLine();
                    System.out.print("Enter professor last name: ");
                    String lastNameValue = scanner.nextLine();
                    System.out.print("Enter professor gender: ");
                    String sexValue = scanner.nextLine();
                    System.out.print("Enter professor age: ");
                    int ageValue = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter date of birth (YYYY-MM-DD): ");
                    LocalDate dateOfBirthValue = LocalDate.parse(scanner.nextLine(), formatter);
                    System.out.print("Enter professor CNP: ");
                    long cnpValue = Long.parseLong(scanner.nextLine());
                    System.out.print("Enter professor address: ");
                    String addressValue = scanner.nextLine();
                    professorList.addProfessor(new Professor(firstNameValue, lastNameValue, sexValue, ageValue, dateOfBirthValue, cnpValue, addressValue));
                }
                case 3 -> {
                    System.out.print("Enter the course type (Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History): ");
                    String typeValue = scanner.nextLine();
                    System.out.print("Enter course starting date and time: ");
                    LocalDateTime schedule = LocalDateTime.parse(scanner.nextLine(), formatterTime);
                    System.out.print("Enter duration: ");
                    int duration = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter assigned professor by first name (needs to exist first): ");
                    String professor = scanner.nextLine();
                    while (!typeValue.equals("Math") && !typeValue.equals("Computer Science") && !typeValue.equals("Physics") && !typeValue.equals("Chemistry") && !typeValue.equals("Biology") && !typeValue.equals("Geography") && !typeValue.equals("English") && !typeValue.equals("History")) {
                        System.out.print("The type of course does not exist. Please input it again: ");
                        typeValue = scanner.nextLine();
                    }
                    if ((professorList.findProfessorByName(professor)) != null) {
                        list.addCourse(new Course(typeValue, schedule, duration, description, professorList.findProfessorByName(professor)));
                    }
                }
                case 4 -> catalog.showAllStudents();
                case 5 -> professorList.showAllProfessors();
                case 6 -> list.showAllCourses();
                case 0 -> {
                    break MENU_LOOP;
                }
                default -> System.out.println("Not valid. Choose again your item.");
            }
        }
    }
}
