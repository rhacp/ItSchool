package session07_utility_classes.challenges;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Challenge04 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 4");
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

        if (areDatesEqual(date1Value, date2Value) == true) {
            System.out.println("The dates are equals.");
        } else {
            System.out.println("The dates are not equals.");
        }

    }

    public static boolean areDatesEqual(String date1, String date2) {
        LocalDate firstDate = LocalDate.parse(date1);
        LocalDate secondDate = LocalDate.parse(date2);
        if (firstDate.equals(secondDate)) {
            return true;
        } else {
            return false;
        }
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
