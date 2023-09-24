package session7.challenges;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Challenge03 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 3");
        System.out.println("---");
        System.out.println("");

        String dateValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date: ");
        System.out.println("yyyy-MM-dd");
        dateValue = scanner.nextLine();
        while (isValidDate(dateValue) == false) {
            System.out.println("");
            System.out.println("The date format is not valid. Please enter the date again: ");
            dateValue = scanner.nextLine();
        }
        scanner.close();
        System.out.println("");
        System.out.println("Converted as date: " + convertStringToLocalDateTime(dateValue));
    }

    public static LocalDate convertStringToLocalDateTime(String value) {
        LocalDate date = LocalDate.parse(value);
        return date;
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
