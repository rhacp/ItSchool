package session07_utility_classes.challenges;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Challenge09 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 9");
        System.out.println("---");
        System.out.println("");

        String date1Value, date2Value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first date: ");
        System.out.println("(yyyy-MM-dd)");
        date1Value = scanner.nextLine();
        while (isValidDate(date1Value) == false) {
            System.out.println("");
            System.out.println("The date format is not valid. Please enter the date again: ");
            date1Value = scanner.nextLine();
        }
        System.out.println("");
        System.out.println("Enter second date: ");
        System.out.println("(yyyy-MM-dd)");
        date2Value = scanner.nextLine();
        while (isValidDate(date2Value) == false) {
            System.out.println("");
            System.out.println("The date format is not valid. Please enter the date again: ");
            date2Value = scanner.nextLine();
        }
        System.out.println("");
        scanner.close();

        System.out.println("The difference between your dates in days is: " + daysBetween(date1Value, date2Value));
    }

    public static int daysBetween(String firstInput, String secondInput) {
        LocalDate firstDate = LocalDate.parse(firstInput);
        LocalDate secondDate = LocalDate.parse(secondInput);
        long rez;
        rez = firstDate.toEpochDay() - secondDate.toEpochDay();
        return (int)rez;
    }

    public static boolean isValidDate(String date1) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date1.trim());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
