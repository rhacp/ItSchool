package session12_oop_polymorphism.practice.change_behavior_at_runtime;

public class Bow implements Weapon{

    @Override
    public void use() {
        System.out.println("Shooting an arrow!");
    }
}
