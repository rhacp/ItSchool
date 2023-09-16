package session5.challenges;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 2");
        System.out.println("");

        int indexValue;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month index: ");
        indexValue = scanner.nextInt();

        System.out.println("");
        System.out.println("The month is: " + findMonthByIndex(indexValue));

    }

    public static String findMonthByIndex(int index) {
        String rez;
        switch (index) {
            case 1 -> rez = "January";
            case 2 -> rez = "February";
            case 3 -> rez = "March";
            case 4 -> rez = "April";
            case 5 -> rez = "May";
            case 6 -> rez = "June";
            case 7 -> rez = "July";
            case 8 -> rez = "August";
            case 9 -> rez = "September";
            case 10 -> rez = "October";
            case 11 -> rez = "November";
            case 12 -> rez = "December";
            default -> rez = "Invalid Month";
        }
        return rez;
    }
}
