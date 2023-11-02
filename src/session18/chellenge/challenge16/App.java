package session18.chellenge.challenge16;

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
