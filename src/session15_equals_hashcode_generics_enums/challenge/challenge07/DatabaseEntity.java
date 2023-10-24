package session15_equals_hashcode_generics_enums.challenge.challenge07;

import java.time.LocalTime;
import java.util.Objects;

public class DatabaseEntity {

    private String id;
    private String name;
    private LocalTime timeStamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        System.out.println("ID set to: " + id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name set to: " + name);
    }

    public LocalTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp() {
        this.timeStamp = LocalTime.now();
        System.out.println("Time set to the current time.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatabaseEntity that = (DatabaseEntity) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
