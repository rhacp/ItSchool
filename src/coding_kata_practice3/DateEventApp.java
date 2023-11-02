//Using Java's date/time libraries, create a structure to store events with a date and description.
//Implement a method that allows the addition of events and another that prints all events in chronological order.

//To do: finish this mf -> add to list and sort !!!!

package coding_kata_practice3;

import coding_kata_practice3.models.Event;
import java.awt.*;
import java.util.Scanner;

public class DateEventApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu_LOOP:
        while (true) {
            showOptions();
            String option = scanner.nextLine();
            switch (option) {
                case "1" -> addEvent(scanner);
                case "2" -> viewEvent();
                case "0" -> {
                    break Menu_LOOP;
                }
                default -> System.out.println("Invalid input.");
            }
        }

    }

    private static void addEvent(Scanner scanner) {
        System.out.println("Enter a date: ");
        String date = scanner.nextLine();
        System.out.println("Enter description: ");
        String description = scanner.nextLine();
//        System.out.printf("The event at date: %s%nDescription: %s%n%n", date, description);

        Event event = new Event();
        event.setEventDate(date);
        event.setDescription(description);
        System.out.println(event);
        System.out.println("Event successfully created.");
        System.out.println(" ");
    }

    private static void viewEvent() {
        System.out.println("List of events: ");
    }

    private static void showOptions() {
        System.out.println("1. Add event type");
        System.out.println("2. View events");
        System.out.println("0. Exit");
    }
}