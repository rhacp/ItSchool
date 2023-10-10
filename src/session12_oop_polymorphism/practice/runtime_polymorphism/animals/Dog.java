package session12_oop_polymorphism.practice.runtime_polymorphism.animals;

public class Dog extends Animal{

    @Override
    public String makesSound() {
        return "Dog barks.";
    }
}
