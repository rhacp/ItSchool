package session03_java_operators.practice;

public class IncrementAndDecrementOperators {

    private static int firstNumber = 5;
    private static int secondNumber = 5;

    public static void main(String[] args) {
        System.out.println(firstNumber++);
        System.out.println(++secondNumber);

        System.out.println("Print incremented numbers:");
        printIncrementedNumbers(2, 7);
    }
    public static void printIncrementedNumbers(int  number1, int number2){
        int result1 = number1++ * 5;
        int result2 = ++number2 * 5;
        System.out.println(result1); //25
        System.out.println(result2); //30
    }
}
