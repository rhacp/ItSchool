package session7.challenges;

import java.time.LocalDate;
import java.util.Scanner;

public class Challenge07 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 7");
        System.out.println("---");
        System.out.println("");
        int weeksValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of weeks you want added to the current date: ");
        weeksValue = scanner.nextInt();
        System.out.println("");

        System.out.println("Result: " + addWeeksToToday(weeksValue));
    }

    public static LocalDate addWeeksToToday(int weeks) {
        LocalDate addition = LocalDate.now();
        addition = addition.plusWeeks(weeks);
        return addition;
    }
}
