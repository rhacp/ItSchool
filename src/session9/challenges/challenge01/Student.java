package session9.challenges.challenge01;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private LocalDate dateOfBirth;
    private long cnp;
    private String address;

    public Student(String firstName, String lastName, String sex, int age, LocalDate dateOfBirth, long cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
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

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", CNP=" + cnp +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && getCnp() == student.getCnp() && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getSex(), student.getSex()) && Objects.equals(getDateOfBirth(), student.getDateOfBirth()) && Objects.equals(getAddress(), student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getSex(), getAge(), getDateOfBirth(), getCnp(), getAddress());
    }
}
