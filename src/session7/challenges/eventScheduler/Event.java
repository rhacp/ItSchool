package session7.challenges.eventScheduler;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Event {
    //In progress
    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        STILL IN PROGRESS!

    public Event(String eventName, String eventDescription, String eventDateTime, String reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = this.eventDateTime.parse(eventDateTime, formatter);
        this.reminderDateTime = this.reminderDateTime.parse(reminderDateTime, formatter);
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = this.eventDateTime.parse(eventDateTime, this.formatter);
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(String reminderDateTime) {
        this.reminderDateTime = this.reminderDateTime.parse(reminderDateTime, this.formatter);
    }

    public String timeUntilEvent() {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatterS = DateTimeFormatter.ofPattern("ss");
        DateTimeFormatter formatterMin = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter formatterH = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter formatterM = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter formatterY = DateTimeFormatter.ofPattern("yyyy");

        String rez1 = currentTime.format(formatterS);
        LocalDateTime rez = this.eventDateTime.minusSeconds(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterMin);
        rez = rez.minusMinutes(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterH);
        rez = rez.minusHours(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterD);
        rez = rez.minusDays(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterM);
        rez = rez.minusMonths(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterY);
        rez = rez.minusYears(Long.valueOf(rez1));

        if (rez.getYear() == 0) {
            return ("Time left until event: " + rez.format(formatterS) + " seconds, " + rez.format(formatterMin) + " minutes, " + rez.format(formatterH) + " hours, " + rez.format(formatterD) + " days, " + rez.format(formatterM) + " months, " + "0000 years.");

        } else {
            return ("Time left until event: " + rez.format(formatterS) + " seconds, " + rez.format(formatterMin) + " minutes, " + rez.format(formatterH) + " hours, " + rez.format(formatterD) + " days, " + rez.format(formatterM) + " months, " + rez.format(formatterY) + " years.");
        }
    }

    public String timeUntilReminder() {
        //Returns the time left until the reminder should notify the user.
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatterS = DateTimeFormatter.ofPattern("ss");
        DateTimeFormatter formatterMin = DateTimeFormatter.ofPattern("mm");
        DateTimeFormatter formatterH = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter formatterD = DateTimeFormatter.ofPattern("dd");
        DateTimeFormatter formatterM = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter formatterY = DateTimeFormatter.ofPattern("yyyy");

        String rez1 = currentTime.format(formatterS);
        LocalDateTime rez = this.reminderDateTime.minusSeconds(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterMin);
        rez = rez.minusMinutes(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterH);
        rez = rez.minusHours(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterD);
        rez = rez.minusDays(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterM);
        rez = rez.minusMonths(Long.valueOf(rez1));

        rez1 = currentTime.format(formatterY);
        rez = rez.minusYears(Long.valueOf(rez1));

        if (rez.getYear() == 0) {
            return ("Time left until event: " + rez.format(formatterS) + " seconds, " + rez.format(formatterMin) + " minutes, " + rez.format(formatterH) + " hours, " + rez.format(formatterD) + " days, " + rez.format(formatterM) + " months, " + "0000 years.");

        } else {
            return ("Time left until event: " + rez.format(formatterS) + " seconds, " + rez.format(formatterMin) + " minutes, " + rez.format(formatterH) + " hours, " + rez.format(formatterD) + " days, " + rez.format(formatterM) + " months, " + rez.format(formatterY) + " years.");
        }
    }
}
