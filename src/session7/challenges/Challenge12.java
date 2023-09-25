package session7.challenges;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Challenge12 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 12");
        System.out.println("---");
        System.out.println("");

        String date1Value;
        String convertTo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date and time (EEST): ");
        System.out.println("(yyyy-MM-dd HH:mm:ss)");
        date1Value = scanner.nextLine();
        while (isValidDate(date1Value) == false) {
            System.out.println("");
            System.out.println("The date format is not valid. Please enter the date again: ");
            date1Value = scanner.nextLine();
        }
        System.out.println("");

        System.out.println("Enter the time zone for the conversion: ");
        System.out.println("EST;PST;AEST;EET;MST;");
        convertTo = scanner.nextLine();
        while (!convertTo.equals("EST") && !convertTo.equals("PST") && !convertTo.equals("AEST") && !convertTo.equals("EET") && !convertTo.equals("MST") && !convertTo.equals("EEST")) {
            System.out.print("The time zone is not in the list. Enter it again: ");
            convertTo = scanner.nextLine();
            System.out.println("");
        }
        scanner.close();

        System.out.println("");
        System.out.println("The conversion to " + convertTo + " is: " + convertToTimeZone(convertTo, date1Value));
    }

    public static String convertToTimeZone(String convertTo, String value) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime firstTime = LocalDateTime.parse(value, formatter);
        long help = 0;
        LocalDateTime rez = null;

        switch (convertTo){
            case "EST" -> {
                rez = firstTime.minusHours(7);
            }
            case "PST" -> {
                rez = firstTime.minusHours(10);
            }
            case "AEST" -> {
                rez = firstTime.plusHours(8);
            }
            case "EET" -> {
                rez = firstTime.minusHours(0);
            }
            case "MST" -> {
                rez = firstTime.minusHours(8);
            }
        }
        return rez.format(formatter);
    }
//    EST;PST;AEST;EET;MST;EEST;

    public static boolean isValidDate(String date1) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date1.trim());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
