package session11_oop_abstraction.challenge.challenge05;

public class App {

    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();

        cat.cats();
        cat.dogs();
        dog.dogs();
        cat.dogs();

        /***
         * Because the cats and dogs methods are both abstract, we need to create both of them in the subclasses
         * Cats and Dogs even if they don't do anything.
         */
    }
}
