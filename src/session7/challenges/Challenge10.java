package session7.challenges;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 10");
        System.out.println("---");
        System.out.println("");

        String date1Value, date2Value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date to check: ");
        System.out.println("(yyyy-MM-dd)");
        date1Value = scanner.nextLine();
        while (isValidDate(date1Value) == false) {
            System.out.println("");
            System.out.println("The date format is not valid. Please enter the date again: ");
            date1Value = scanner.nextLine();
        }
        System.out.println("");
        System.out.println("The date is valid!");
        scanner.close();
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
