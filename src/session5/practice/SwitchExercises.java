package session5.practice;

import java.util.Scanner;

public class SwitchExercises {

    public static void main(String[] args) {
        char grade;
        String season = "Winter";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your grade: ");
//        grade = scanner.next().charAt(0);
        grade = 'B';
        System.out.println("Your grade is: " + grade);

//        printGradeInformation(grade);
        printGradeInformationWithEnhancedSwitch(grade);

        SwitchExercises switchExercises = new SwitchExercises();
        switchExercises.printGradeInformation(grade);

        System.out.println("");
        System.out.println("Your season is winter.");
        printSeasonInfo(season);
    }

    private void printGradeInformation(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Nerd!");
                break;
            case 'B':
                System.out.println("You should have more fun!");
                break;
            case 'C':
                System.out.println("You have a balanced life but you should still have a bit more fun.");
                break;
            default:
                System.out.println("You definitely had enough fun. Go do your homework boy!");
                break;
        }
    }

    private static void printGradeInformationWithEnhancedSwitch(char grade) {
        switch (grade) {
            case 'A' -> System.out.println("Nerd!");
            case 'B' -> System.out.println("You should have more fun!");
            case 'C' -> System.out.println("You have a balanced life but you should still have a bit more fun.");
            default -> System.out.println("You definitely had enough fun. Go do your homework boy!");
        }
    }

    private static void printSeasonInfo(String season) {
        switch (season) {
            case "Winter" -> System.out.println("It's cold!");
            case "Spring" -> System.out.println("Flowers bloom!");
            case "Summer" -> System.out.println("It's hot!");
            default -> System.out.println("Unknown season...");
        }
    }
}
