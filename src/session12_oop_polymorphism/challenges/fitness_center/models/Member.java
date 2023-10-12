package session12_oop_polymorphism.challenges.fitness_center.models;

import java.util.UUID;

public class Member {

    private UUID memberID;
    private PersonalDetails personalDetails;
    private MembershipTier membershipTier;

    public Member(UUID memberID, PersonalDetails personalDetails, MembershipTier membershipTier) {
        this.memberID = memberID;
        this.personalDetails = personalDetails;
        this.membershipTier = membershipTier;
    }

    public UUID getMemberID() {
        return memberID;
    }

    public void setMemberID(UUID memberID) {
        this.memberID = memberID;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
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
                "memberID=" + memberID +
                ", personalDetails=" + personalDetails +
                ", membershipTier=" + membershipTier +
                '}';
    }
}
