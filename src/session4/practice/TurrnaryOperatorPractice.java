package session4.practice;

public class TurrnaryOperatorPractice {

    public static void main(String[] args) {
        int number = 0;
        String result = (number > 0) ? "Positive" : (number == 0) ? "Zero" : "Negative";
        System.out.println("The number is: " + result);
    }
}
