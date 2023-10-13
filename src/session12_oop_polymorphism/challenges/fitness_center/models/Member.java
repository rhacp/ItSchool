package session12_oop_polymorphism.challenges.fitness_center.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Member extends User {

    private MembershipTier membershipTier;
    private LocalDate expirationDate;
    private double balance;

    public Member(String name, MembershipTier membershipTier) {
        super(name);
        this.membershipTier = membershipTier;
        expirationDate = LocalDate.now().plusMonths(1);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public MembershipTier getMembershipTier() {
        return membershipTier;
    }

    public void setMembershipTier(MembershipTier membershipTier) {
        this.membershipTier = membershipTier;
    }

    @Override
    public String toString() {
        return "Member{" +
                "membershipTier=" + membershipTier +
                ", Name=" + getName() +
                '}';
    }
}
