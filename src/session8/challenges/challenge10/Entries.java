package session8.challenges.challenge10;

import java.time.LocalDate;

public class Entries {

    private String entryText;
    private LocalDate date;

    public Entries(String entryText, LocalDate time) {
        this.entryText = entryText;
        this.date = time;
    }

    public String getEntryText() {
        return entryText;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setEntryText(String entryText) {
        this.entryText = entryText;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
