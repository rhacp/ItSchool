package session7.challenges;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Challenge05 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 5");
        System.out.println("---");
        System.out.println("");

        String dateValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date: ");
        System.out.println("(yyyy-MM-dd)");
        dateValue = scanner.nextLine();

        while (isValidDate(dateValue) == false) {
            System.out.println("");
            System.out.println("The date format is not valid. Please enter the date again: ");
            dateValue = scanner.nextLine();
        }
        scanner.close();
        LocalDate checkValue = LocalDate.parse("2019-12-10");
        System.out.println("");

        if (areDatesEqual(checkValue, dateValue) == true) {
            System.out.println("Your date is 10th December 2019.");
        } else {
            System.out.println("Your date is not 10th December 2019.");
        }
    }

    public static boolean areDatesEqual(LocalDate check, String date1) {
        LocalDate firstDate = LocalDate.parse(date1);
        if (firstDate.equals(check)) {
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
