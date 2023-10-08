package session11_oop_abstraction.challenge.challenge06;

public class Area extends Shape{

    @Override
    int rectangleArea(int length, int width) {
        return (length * width);
    }

    @Override
    int squareArea(int side) {
        return (int)(Math.pow(side, 2));
    }

    @Override
    double circleArea(int radius) {
        return (Math.PI * (Math.pow(radius, 2)));
    }
}
