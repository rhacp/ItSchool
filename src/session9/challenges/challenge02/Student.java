package session9.challenges.challenge02;

import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;

public class Student {

    private String name;
    private UUID id;
    private ArrayList<String> classes = new ArrayList<>();
    private ArrayList<Long> grades = new ArrayList<>();

    public Student (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setUUID(){
        id = UUID.randomUUID();
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + id +
                '}';
    }

    public void addClass(String classToAdd) {
        classes.add(classToAdd);
    }

    public void addGrade(long grade, String gradeClass) {
        for (String element : classes) {
            if (element == gradeClass) {
                grades.set(classes.indexOf(element), grade);
            }
        }
    }

    public long averageGrade() {
        long sum = 0;
        for (long element : grades) {
            sum += element;
        }
        return (sum / grades.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) && Objects.equals(id, student.id) && Objects.equals(classes, student.classes) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), id, classes, grades);
    }
}
