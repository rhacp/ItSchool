package session6.practice;

import java.util.UUID;

public class User {

    public String firstName;
    public int age;
    private UUID userID;
    private String lastName;
    private boolean oldCustomer;
    private String passsword;
    private String signInDate;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UUID getUserId() {
        return userID;
    }
}






