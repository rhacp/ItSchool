package session15_equals_hashcode_generics_enums.challenge.challenge03;

import java.util.Objects;

public class Student {

    private String name;
    private short age;
    private String studentId;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name set to: " + name);
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
        System.out.println("Age set to: " + age);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email set to: " + email);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return getAge() == student.getAge() && Objects.equals(getName(), student.getName()) && Objects.equals(getEmail(), student.getEmail());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEmail());
    }
}
