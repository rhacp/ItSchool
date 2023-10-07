package session11_oop_abstraction.practice.math_example;

public class Circle implements MathConstants{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        //return PI * (...)
        return PI;
    }
}
