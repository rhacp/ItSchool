package session18.challenge.challenge16;

import session18.challenge.challenge16.models.ClassPair;

public class App {

    public static void main(String[] args) {
        ClassPair<String, Integer> firstPair = new ClassPair<>();
//        ClassPair<Long, Character> secondPair = new ClassPair<>();

        firstPair.setTtype("Hello");
        firstPair.setUtype(5);

        String message = firstPair.getTtype();
        int secondMessage = firstPair.getUtype();
        System.out.println("Pair 1: [" + message + ", " + secondMessage + "]");
        System.out.printf("Pair 1: [%s, %d]", message, secondMessage);
    }
}
