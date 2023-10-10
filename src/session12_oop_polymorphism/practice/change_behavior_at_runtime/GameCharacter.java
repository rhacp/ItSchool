package session12_oop_polymorphism.practice.change_behavior_at_runtime;

public class GameCharacter {

    private Weapon weapon; //using composition

    public GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.use();
    }
}
