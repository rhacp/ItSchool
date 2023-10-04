package session10_java_oop_inheritance_encapsulation.practice.car_dealership;

import java.time.LocalDate;

public class NewCar extends Car {

    private LocalDate expirationDate;

    public NewCar(String model, int years, double price, LocalDate expirationDate) {
        super(model, years, price);
        this.expirationDate = expirationDate;
    }

    public void printExpirationDate() {
        System.out.println(expirationDate);
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
