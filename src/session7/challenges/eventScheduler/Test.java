package session7.challenges.eventScheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Test {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime test = LocalDateTime.parse("2024-02-22 20:00:00", formatter);
        DateTimeFormatter formatterS = DateTimeFormatter.ofPattern("ss");
        DateTimeFormatter formatterMin = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter formatterH = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter formatterM = DateTimeFormatter.ofPattern("MM");

        System.out.println(test.format(formatterH));
        String test1 = test.format(formatterH);

        System.out.println(timeUntilEventCopy(test));
    }

    public static String timeUntilEventCopy(LocalDateTime eventDateTime) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatterS = DateTimeFormatter.ofPattern("ss");
        DateTimeFormatter formatterMin = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter formatterH = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter formatterM = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatterY = DateTimeFormatter.ofPattern("yyyy");
        long seconds, minutes, hours, days, months;
        System.out.println(currentTime);

        String rez1 = currentTime.format(formatterS);
        LocalDateTime rez = eventDateTime.minusSeconds(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterMin);
        rez = rez.minusMinutes(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterH);
        rez = rez.minusHours(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterD);
        rez = rez.minusDays(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterM);
        rez = rez.minusMonths(Long.valueOf(rez1));

        System.out.println(rez.format(formatter));

        rez1 = currentTime.format(formatterY);
        rez = rez.minusYears(Long.valueOf(rez1));
        if (rez.getYear() == 0) {
            return ("Time left until event: " + rez.format(formatterS) + " seconds, " + rez.format(formatterMin) + " minutes, " + rez.format(formatterH) + " hours, " + rez.format(formatterD) + " days, " + rez.format(formatterM) + " months, " + "0000 years.");

        } else {
            return ("Time left until event: " + rez.format(formatterS) + " seconds, " + rez.format(formatterMin) + " minutes, " + rez.format(formatterH) + " hours, " + rez.format(formatterD) + " days, " + rez.format(formatterM) + " months, " + rez.format(formatterY) + " years.");
        }
    }
}
