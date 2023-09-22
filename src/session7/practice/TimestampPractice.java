package session7.practice;

import java.sql.Timestamp;

public class TimestampPractice {

    public static void main(String[] args) {
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Current timestamp: " + currentTimestamp);

        Timestamp currentTimestampSecond = new Timestamp(1695402610000L);
        System.out.println("Current timestamp: " + currentTimestampSecond);

        Timestamp timestamp1 = Timestamp.valueOf("2023-09-20 15:20:30.214");
        Timestamp timestamp2 = Timestamp.valueOf("2023-09-20 15:21:30.214");

        System.out.println("");
        long differenceInSeconds = (timestamp2.getTime() - timestamp1.getTime()) / 1000;
        System.out.println("The difference is: " + differenceInSeconds);
    }
}
