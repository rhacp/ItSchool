package session7.challenges;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Challenge06 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 6");
        System.out.println("---");
        System.out.println("");

        LocalTime now = LocalTime.now();
        Date now1 = new Date();
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");

        System.out.println("Your local time is: " + now);
        System.out.println("Your local time is: " + time.format(now1));
    }

}
