package session7.challenges;

import java.time.LocalDate;

public class Challenge01 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 1");
        System.out.println("---");
        System.out.println("");

        currentTime();
    }

    public static void currentTime() {
        LocalDate now = LocalDate.now();
        System.out.println("Today's date is: " + now);
    }
}
