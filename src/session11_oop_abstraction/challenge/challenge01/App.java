package session11_oop_abstraction.challenge.challenge01;

public class App {

    public static void main(String[] args) {
        FirstChild firstChild = new FirstChild();
        SecondChild secondChild = new SecondChild();

        firstChild.message();
        secondChild.message();
    }
}
