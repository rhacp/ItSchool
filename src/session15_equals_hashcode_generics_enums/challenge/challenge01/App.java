package session15_equals_hashcode_generics_enums.challenge.challenge01;

public class App {

    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle();
        System.out.println("First rectangle created:");
        firstRectangle.setHeight(10);
        firstRectangle.setWidth(5);
        System.out.println("");

        Rectangle secondRectangle = new Rectangle();
        System.out.println("Second rectangle created:");
        secondRectangle.setHeight(10);
        secondRectangle.setWidth(5);
        System.out.println("");

        System.out.println("firstRectangle equals secondRectangle: " + firstRectangle.equals(secondRectangle));
        System.out.println("firstRectangle hashcode: " + firstRectangle.hashCode());
        System.out.println("secondRectangle hashcode: " + secondRectangle.hashCode());
    }
}
