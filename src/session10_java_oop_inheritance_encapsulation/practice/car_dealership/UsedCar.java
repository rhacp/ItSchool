package session10_java_oop_inheritance_encapsulation.practice.car_dealership;

public class UsedCar extends Car {

    private int previousOwners;
    private int mileage;

    public UsedCar(String model, int year, double price, int previousOwners, int mileage) {
        super(model, year, price);
        this.previousOwners = previousOwners;
        this.mileage = mileage;
    }

    public int getPreviousOwners() {
        return previousOwners;
    }

    public int getMileage() {
        return mileage;
    }
}
