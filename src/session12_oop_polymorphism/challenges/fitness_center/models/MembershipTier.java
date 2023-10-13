package session12_oop_polymorphism.challenges.fitness_center.models;

public enum MembershipTier {
    BASIC(0),
    PREMIUM(10),
    PLATINUM(15);

    private int bonus;

    MembershipTier(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
