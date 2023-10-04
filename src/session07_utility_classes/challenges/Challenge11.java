package session07_utility_classes.challenges;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Challenge11 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 11");
        System.out.println("---");
        System.out.println("");

        String time1Value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first time: ");
        System.out.println("(HH:mm:ss)");
        time1Value = scanner.nextLine();
        while (isValidTime(time1Value) == false) {
            System.out.println("");
            System.out.println("The date format is not valid. Please enter the date again: ");
            time1Value = scanner.nextLine();
        }
        System.out.println("");
        scanner.close();
        elapsedTimeSince(time1Value);
    }

    public static void elapsedTimeSince(String time1) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat secondFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentTime = new Date();
        String help = timeFormat.format(currentTime);
        String secondHelp = help + " " + time1;
//        System.out.println(help);
//        System.out.println(secondHelp);
        Date firstTime = null;
        try {
            firstTime = secondFormat.parse(secondHelp);
        } catch (ParseException e) {
        }
        long rez;
        rez = currentTime.getTime() - firstTime.getTime();
        System.out.println("Input time: " + secondFormat.format(firstTime));
        System.out.println("Current time: " + secondFormat.format(currentTime));
        System.out.println("");
//        System.out.println(rez);
        System.out.println("Difference: ");
        System.out.print(((((rez / 1000) / 60) / 60) % 24) + " hours, ");
        System.out.print((((rez / 1000) / 60) % 60) + " minutes, ");
        System.out.print(((rez / 1000) % 60) +  " seconds.");
    }

    public static boolean isValidTime(String time1) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeFormat.setLenient(false);
        try {
            timeFormat.parse(time1.trim());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
