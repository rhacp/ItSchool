package session15_equals_hashcode_generics_enums.challenge.challenge02;

import java.util.Objects;

public class Person {

    private String name;
    private short age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
