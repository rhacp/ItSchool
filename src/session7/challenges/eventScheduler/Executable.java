package session7.challenges.eventScheduler;

import java.util.Scanner;

public class Executable {

    public static void main(String[] args) {
//        STILL IN PROGRESS!
//        Event wedding = new Event("Wedding", "Just a wedding!", "2024-02-22 20:00:00", "2024-01-22 20:00:00");
//        System.out.println(wedding.timeUntilEvent());
//        System.out.println(wedding.timeUntilReminder());
        menu();
}


    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Scanner newscanner = new Scanner(System.in);
        int helpCounter, secondCounter;
        MENU_LOOP:
        while (true) {
            System.out.println("FIRST MENU");
            System.out.println("Choose your item:");
            System.out.println("1. Add new event and select it.");
            System.out.println("2. Get events list and select one. (NOT WORKING YET)");
            System.out.println("3. Remove event. (NOT WORKING YET)");
            System.out.println("0. Exit.");
            System.out.print("Choose the item by number: ");
            helpCounter = scanner.nextInt();
            System.out.println("");

            switch (helpCounter) {
                case 1 -> {
                    System.out.print("Enter event name: ");
                    String eventName = newscanner.nextLine();

                    System.out.print("Enter event description: ");
                    String eventDescription = newscanner.nextLine();

                    System.out.print("Enter event date and time (yyyy-MM-dd HH:mm:ss): ");
                    String eventDate = newscanner.nextLine();

                    System.out.print("Enter reminder date and time (yyyy-MM-dd HH:mm:ss): ");
                    String eventReminder = newscanner.nextLine();
                    System.out.println("");
                    Event event1 = new Event(eventName, eventDescription, eventDate, eventReminder);

                    System.out.println("SECOND MENU");
                    System.out.println("Choose your item:");
                    System.out.println("1. Get time until the selected event.");
                    System.out.println("2. Get time until the selected event reminder.");
                    System.out.print("Choose the item by number: ");
                    secondCounter = scanner.nextInt();
                    System.out.println("");

                    switch (secondCounter) {
                        case 1 -> {
                            System.out.println(event1.timeUntilEvent());
                            System.out.println("");
                        }
                        case 2 -> {
                            System.out.println(event1.timeUntilReminder());
                            System.out.println("");
                        }
                    }
                }
                case 0 -> {
                    break MENU_LOOP;
                }
            }
        }
        scanner.close();
        newscanner.close();
    }
}
