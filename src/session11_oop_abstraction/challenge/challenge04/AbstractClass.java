package session11_oop_abstraction.challenge.challenge04;

public abstract class AbstractClass {

    public AbstractClass() {
        System.out.println("This is a constructor of abstract class.");
    }

    abstract void a_method();

    public void b_method() {
        System.out.println("This is a normal method of abstract class.");
    }
}
