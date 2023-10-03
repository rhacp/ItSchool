package session10.practice.inheritance;

public class SingleInheritance {


}

class parent {
    void displayParent() {
        System.out.println("This is a parent class method.");
    }
}

class child extends parent {
    @Override
    void displayParent() {
        super.displayParent();
    }
}
