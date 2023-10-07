package session11_oop_abstraction.practice.vehicle_example;

public class Car extends Vehicle implements Refuelable {

    @Override
    public void refuel() {
        //from interface
    }

    @Override
    void acceleration() {
        //from abs class
    }

    @Override
    void brake() {
        //from abs class
    }
}
