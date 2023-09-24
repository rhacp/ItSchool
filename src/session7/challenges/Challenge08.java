package session7.challenges;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Challenge08 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 8");
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
        System.out.println("Da of the week: " + findDayOfWeek(dateValue));
    }

    public static DayOfWeek findDayOfWeek(String date) {
        LocalDate dateWeek = LocalDate.parse(date);
        DayOfWeek rez;
        rez = dateWeek.getDayOfWeek();
        return rez;
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
