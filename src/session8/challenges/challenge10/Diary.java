package session8.challenges.challenge10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Diary {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 10");
        System.out.println("---");
        System.out.println("");

        Journal journal = new Journal();
        menu(journal);
    }

    public static void menu(Journal journal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        int helpCounter;
        MENU_LOOP:
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("---");
            System.out.println("Choose your item:");
            System.out.println("1. Add entry.");
            System.out.println("2. Edit entry.");
            System.out.println("3. Remove entry.");
            System.out.println("4. Display all entries.");
            System.out.println("0. Exit.");
            System.out.println("");
            System.out.print("Choose the item by number: ");
            helpCounter = Integer.parseInt(scanner.nextLine());

            switch (helpCounter) {
                case 1 -> {
                    System.out.println("Enter your entry starting with the time (YYYY-MM-DD : text entry):");
                    String help = scanner.nextLine();
                    LocalDate time = LocalDate.parse(help.substring(0, 10), formatter);
//                ArrayList<Entries> entryArray = new ArrayList<>();
//                entryArray.add(new Entries(help.substring(9), time));
                    journal.addEntry(new Entries(help.substring(13), time));
                    System.out.println("The entry was added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter the date of the entry you want to delete (YYYY-MM-DD): ");
                    String help = scanner.nextLine();
                    System.out.println("The entry was cleared. Please type the new entry text you want assigned to the specified date: ");
                    String secondHelp = scanner.nextLine();
                    journal.editEntry(help, secondHelp);
                    System.out.println("The entry was successfully updated!");
                }
                case 3 -> {
                    System.out.print("Enter the date of the entry you want to delete (YYYY-MM-DD): ");
                    String help = scanner.nextLine();
                    journal.deleteEntry(help);
                    System.out.println("The entry was successfully deleted!");
                }
                case 4 -> {
                    System.out.println("");
                    journal.showAllEntries();
                }
                case 0 -> {
                    break MENU_LOOP;
                }
            }
        }
    }
}
