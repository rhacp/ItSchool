package session07_utility_classes.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePractice {

    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("The current date and time is " + current);

        LocalDateTime newTime = current.plusHours(10).plusMinutes(5);
        System.out.println("After adding 10 hours and 5 minutes: " + newTime);

        System.out.println("");
        LocalDate datePart = current.toLocalDate();
        LocalTime timePart = current.toLocalTime();
        System.out.println("Date: " + datePart);
        System.out.println("Time: " + timePart);
        System.out.println("");

        checkBeforeAndAfter();
        System.out.println("");

        String dateTimeValue = "2025-01-01 10:30";
        long start = System.currentTimeMillis();
        convertStringToLocalDateTime(dateTimeValue);
        long end = System.currentTimeMillis();
        System.out.println("Total time of execution: " + (end - start) + " milliseconds");
    }

    public static void convertStringToLocalDateTime(String dateTime) {
        //2025-01-01 10:30
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTimeConverted = LocalDateTime.parse(dateTime, formatter);
        System.out.println("Parsed LocalDateTime: " + dateTimeConverted);
    }

    public static void checkBeforeAndAfter() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 1, 1, 10, 30);

        if (dateTime.isBefore(LocalDateTime.now())) {
            System.out.println(dateTime + " is before current date-time.");
        } else {
            System.out.println(dateTime + " is after current date-time.");
        }
    }
}
