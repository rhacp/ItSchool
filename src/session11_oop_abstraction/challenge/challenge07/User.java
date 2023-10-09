package session11_oop_abstraction.challenge.challenge07;

import java.util.UUID;

public abstract class User implements UserID{

    protected String name;
    protected UUID userId;

    protected String Password;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract UUID getUserId();

    public abstract void setUserId();

    public abstract String getPassword();

    public abstract void setPassword(String password);
}
