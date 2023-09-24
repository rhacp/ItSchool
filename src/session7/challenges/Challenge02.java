package session7.challenges;

import java.util.Date;

public class Challenge02 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 2");
        System.out.println("---");
        System.out.println("");

        Date dateCurrent = new Date();
        System.out.println("Your current date is: " + dateCurrent);
        System.out.println("");
        yearMonthDay(dateCurrent);
    }

    public static void yearMonthDay(Date input) {
        int year = input.getYear();
        int month = input.getMonth();
        int day = input.getDate();
        System.out.println("Year: " + (year + 1900));
        System.out.println("Month: " + (month +  1));
        System.out.println("Day: " + day);
    }
}
