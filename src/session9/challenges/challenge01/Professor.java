package session9.challenges.challenge01;

import java.time.LocalDate;
import java.util.Objects;

public class Professor {

    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private LocalDate dateOfBirth;
    private long CNP;
    private String address;

    public Professor(String firstName, String lastName, String sex, int age, LocalDate dateOfBirth, long CNP, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getCNP() {
        return CNP;
    }

    public void setCNP(long CNP) {
        this.CNP = CNP;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", CNP=" + CNP +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return getAge() == professor.getAge() && getCNP() == professor.getCNP() && Objects.equals(getFirstName(), professor.getFirstName()) && Objects.equals(getLastName(), professor.getLastName()) && Objects.equals(getSex(), professor.getSex()) && Objects.equals(getDateOfBirth(), professor.getDateOfBirth()) && Objects.equals(getAddress(), professor.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getSex(), getAge(), getDateOfBirth(), getCNP(), getAddress());
    }
}
