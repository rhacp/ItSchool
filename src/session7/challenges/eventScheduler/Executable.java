package session7.challenges.eventScheduler;

import java.util.Scanner;

public class Executable {

    public static void main(String[] args) {
//        STILL IN PROGRESS!
//        Event wedding = new Event("Wedding", "Just a wedding!", "2024-02-22 20:00:00", "2024-01-22 20:00:00");
//
//        System.out.println(wedding.timeUntilEvent());
//        System.out.println(wedding.timeUntilReminder());
        Scanner scanner = new Scanner(System.in);
        Event event2 = new Event();
        event2.setEventName(scanner.nextLine());
        menu();
    }


    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int helpCounter, secondCounter;
        System.out.println("FIRST MENU");
        System.out.println("Choose your item:");
        System.out.println("1. Add new event and select it.");
        System.out.println("2. Get events list and select one.");
        System.out.println("3. Remove event.");
        System.out.print("Choose the item by number: ");
        helpCounter = scanner.nextInt();
        System.out.println("");

        switch (helpCounter) {
            case 1 -> {
                Event event1 = new Event();
                System.out.print("Enter event name: ");
                event1.setEventName(scanner.nextLine());
                System.out.println("");

                System.out.print("Enter event description: ");
                event1.setEventDescription(scanner.next());
                System.out.println("");

                System.out.print("Enter event date and time (yyyy-MM-dd HH:mm:ss): ");
                event1.setEventDateTime(scanner.nextLine());
                System.out.println("");

                System.out.print("Enter reminder date and time (yyyy-MM-dd HH:mm:ss): ");
                event1.setReminderDateTime(scanner.nextLine());
                System.out.println("");

                System.out.println("SECOND MENU");
                System.out.println("Choose your item:");
                System.out.println("1. Get time until the selected event.");
                System.out.println("2. Get time until the selected event reminder.");
                System.out.print("Choose the item by number: ");
                secondCounter = scanner.nextInt();

                switch (secondCounter) {
                    case 1 -> {
                        System.out.println(event1.timeUntilEvent());
                    }
                    case 2 -> {
                        System.out.println(event1.timeUntilReminder());
                    }
                }
            }
        }
        scanner.close();
    }
}
