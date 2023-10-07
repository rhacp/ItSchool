package session11_oop_abstraction.practice.vehicle_example;

public abstract class Vehicle {

    int speed;

    abstract void acceleration();

    abstract void brake();

    void retractableHood() {
        System.out.println("Hood on/off.");
    }
}
