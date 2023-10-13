package session12_oop_polymorphism.challenges.fitness_center.testInterface;

public class Drink implements Item2 {

    private String name;

    @Override
    public void use() {
        System.out.println("I am using the drink, not drinking");
    }
}
