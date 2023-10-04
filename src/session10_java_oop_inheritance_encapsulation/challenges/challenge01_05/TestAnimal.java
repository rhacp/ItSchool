package session10_java_oop_inheritance_encapsulation.challenges.challenge01_05;

public class TestAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        System.out.print("Dog sound: ");
        dog.sound();
        System.out.print("Cat sound: ");
        cat.sound();
        System.out.print("Wold sound: ");
        wolf.sound();
    }
}
