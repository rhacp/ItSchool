package session7.challenges.eventScheduler;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    //In progress
    private List<String> events = new ArrayList<>();

    public void addEvent(Event e) {
//        Adds an event to the list.
    }
    public void removeEvent(String eventName) {
//        Removes an event by its name.
    }
    public void getUpcomingEvents(int n) {
//        Returns the next n upcoming events.
    }
    public void getEventsOn(LocalDate date) {
//        Returns all events scheduled for a specific date.
    }
    public void getPendingReminders() {
//        Returns all reminders that are due to notify the user soon(e.g., in the next 24hours).
    }
}
