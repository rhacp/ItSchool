package session12_oop_polymorphism.practice.has_a;

public class Car {

    private Engine engine; //using composition, Car HAS-A engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void drive() {
        System.out.println("Car is driving.");
    }
}
