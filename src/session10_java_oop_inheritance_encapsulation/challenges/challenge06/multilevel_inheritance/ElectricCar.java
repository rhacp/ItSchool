package session10_java_oop_inheritance_encapsulation.challenges.challenge06.multilevel_inheritance;

public class ElectricCar extends Car{

    private int batteryCapacity;
    private int range;

    public void charge() {
        System.out.println("The battery was charged.");
    }
}
