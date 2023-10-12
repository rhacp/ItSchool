package session12_oop_polymorphism.challenges.fitness_center.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FitnessClass {


    private String className;
    private LocalDateTime classDate;
    private List<Member> memberList = new ArrayList<>();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public LocalDateTime getClassDate() {
        return classDate;
    }

    public void setClassDate(LocalDateTime classDate) {
        this.classDate = classDate;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "FitnessClass{" +
                "className='" + className + '\'' +
                ", classDate=" + classDate +
                ", memberList=" + memberList +
                '}';
    }
}
