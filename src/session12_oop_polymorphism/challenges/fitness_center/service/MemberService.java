package session12_oop_polymorphism.challenges.fitness_center.service;

import session12_oop_polymorphism.challenges.fitness_center.models.Activity;
import session12_oop_polymorphism.challenges.fitness_center.models.Member;
import session12_oop_polymorphism.challenges.fitness_center.models.MembershipTier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MemberService {

    private List<Member> memberList = new ArrayList<>();

    public Member createMember(String name, MembershipTier membershipTier) {
        return new Member(name, membershipTier);
    }

    public void renewalNotification(Member member) {
        if (LocalDate.now().minusDays(3).equals(member.getExpirationDate())) {
            System.out.println("Protect yourself from fatness!");
        } else {
            System.out.println("You still have time to not be fat");
        }
    }

    public void modifyMembership(Member member, String rank) {
        switch (rank.toUpperCase()) {
            case "BASIC" -> member.setMembershipTier(MembershipTier.BASIC);
            case "PREMIUM" -> member.setMembershipTier(MembershipTier.PREMIUM);
            case "PLATINUM" -> member.setMembershipTier(MembershipTier.PLATINUM);
            default -> System.out.println("Invalid input");
        }
    }

    public void printAllMembers() {
        for (Member member : memberList) {
            System.out.println(member);
        }
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public void bookClass(Activity activity, Member member) {
         activity.getMemberList().add(member);
    }
}
