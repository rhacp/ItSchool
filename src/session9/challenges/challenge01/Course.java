package session9.challenges.challenge01;

import java.time.LocalDateTime;

public class Course {

    private String type;
    private LocalDateTime schedule;
    private int duration;
    private String description;
    private Professor professor;

    public Course(String type, LocalDateTime schedule, int duration, String description, Professor professor) {
        this.type = type;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.professor = professor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDateTime schedule) {
        this.schedule = schedule;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "type='" + type + '\'' +
                ", schedule=" + schedule +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", professor=" + professor +
                '}';
    }
}
