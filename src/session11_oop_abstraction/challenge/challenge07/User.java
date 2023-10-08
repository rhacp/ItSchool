package session11_oop_abstraction.challenge.challenge07;

import java.util.UUID;

public class User {

    protected String name;
    protected UUID userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId() {
        this.userId = UUID.randomUUID();
    }
}
