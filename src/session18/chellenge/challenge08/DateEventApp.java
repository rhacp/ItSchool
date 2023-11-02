//Using Java's date/time libraries, create a structure to store events with a date and description.
//Implement a method that allows the addition of events and another that prints all events in chronological order.

//To do: finish this mf -> add to list and sort !!!!

package session18.chellenge.challenge08;

import session18.chellenge.challenge08.models.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DateEventApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Event> eventList = new ArrayList<>();

        Menu_LOOP:
        while (true) {
            showOptions();
            String option = scanner.nextLine();
            switch (option) {
                case "1" -> addEvent(scanner, eventList);
                case "2" -> viewEvents(eventList);
                case "0" -> {
                    break Menu_LOOP;
                }
                default -> System.out.println("Invalid input.");
            }
        }

    }

    private static void addEvent(Scanner scanner, List<Event> eventList) {
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

        int help = 0;
        if (eventList.isEmpty()) {
            eventList.add(event);
        } else {
            for (int index = eventList.size() - 1; index >= 0; index--) {
                if (eventList.get(index).getEventDate().isBefore(event.getEventDate())) {
                    help = index + 1;
                    break;
                }
            }
            eventList.add(help, event);
        }
    }

    private static void viewEvents(List<Event> eventList) {
        System.out.println("List of events: ");
        for (Event element : eventList) {
            System.out.println(element);
        }
        System.out.println(" ");
    }

    private static void showOptions() {
        System.out.println("MENU");
        System.out.println("1. Add event type");
        System.out.println("2. View events");
        System.out.println("0. Exit");
    }
}