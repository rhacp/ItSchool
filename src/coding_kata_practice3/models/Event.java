package coding_kata_practice3.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {

    private LocalDate eventDate;
    private String description;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(String inputDate) {
        // 20-06-2023

        eventDate = LocalDate.parse(inputDate, formatter);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return eventDate.format(formatter) + " " + description;

    }
}
