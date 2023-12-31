package session11_oop_abstraction.challenge.challenge07.user;

import java.util.UUID;

public class FamilyMember extends User{

    //No need of implementing an Interface in Subclass if the Superclass has already implemented the interface.
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

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
