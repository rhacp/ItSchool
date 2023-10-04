package session07_utility_classes.onlineStore;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private String firstName;
    private String LastName;
    private UUID userId;
    private String sex;
    private int age;
    private String email;
    private boolean isMajor;
    private String password;
    private LocalDateTime birthday;
    private LocalDateTime createAt;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMajor() {
        return isMajor;
    }

    public void setMajor(boolean major) {
        isMajor = major;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "session1.practice.User{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", userId=" + userId +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", isMajor=" + isMajor +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", createAt=" + createAt +
                '}';
    }
}
