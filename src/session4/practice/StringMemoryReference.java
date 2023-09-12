package session4.practice;

public class StringMemoryReference {

    public static void main(String[] args) {
        String greeting = new String ("Hello");
        String greetingOne = "hello";
        String greetingTwo = "Hello";

        System.out.println(greetingTwo == greeting); //true
        System.out.println(greetingOne.equalsIgnoreCase(greetingTwo)); //true

        System.out.println(greeting == greetingOne); //false ca a fost definit ca un obiect nu ca un string si are alocare de momorie diferita;
        System.out.println(greeting.equals(greetingOne)); //true ca au aceasi valoare

        int number1 = 10;
        double number2 = 123.2;
        System.out.println(number1 == number2); //false
    }
}
