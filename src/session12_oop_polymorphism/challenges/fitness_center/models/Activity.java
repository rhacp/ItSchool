package session12_oop_polymorphism.challenges.fitness_center.models;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private String name;
    private List<Member> memberList;

    public Activity(String name) {
        this.name = name;
        memberList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
