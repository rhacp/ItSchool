package session11_oop_abstraction.challenge.challenge04;

public class App {

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println("");
        subClass.a_method();
        System.out.println("");
        subClass.b_method();
        System.out.println("");
        System.out.println("---");
        System.out.println("");

        System.out.println("When we create an object of any subclass all the constructors in the corresponding inheritance tree are invoked in the top to bottom approach. The same case applies to abstract classes. Though we cannot create an object of an abstract class, when we create an object of a class which is concrete and subclass of the abstract class, the constructor of the abstract class is automatically invoked. Hence we can have a constructor in abstract classes.");

        /***
         * When we create an object of any subclass all the constructors in the corresponding inheritance
         * tree are invoked in the top to bottom approach. The same case applies to abstract classes.
         * Though we cannot create an object of an abstract class, when we create an object of a class
         * which is concrete and subclass of the abstract class, the constructor of the abstract class
         * is automatically invoked. Hence, we can have a constructor in abstract classes.
         */
    }
}
