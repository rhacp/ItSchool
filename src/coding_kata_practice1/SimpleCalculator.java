package coding_kata_practice1;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        double testMaxValue = Double.MAX_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println(intMaxValue);
        System.out.println(testMaxValue);
        int intTestValue = intMaxValue + 10;
        System.out.println(intTestValue);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert operator: ");
        String operator  = scanner.next();

        System.out.println("Please insert first number: ");
        double number1Value = scanner.nextInt();

        System.out.println("Please insert second number: ");
        double number2Value = scanner.nextInt();

        if ((operator.equals("/")) && number2Value == 0) {
            System.out.println("Invalid input. Enter again the second  number: ");
            number2Value = scanner.nextInt();
        }

        scanner.close();

        calculate(operator, number1Value, number2Value);
    }

    private static void calculate(String operator, double number1, double number2) {
        switch (operator) {
            case "+" -> System.out.println("Sum: " + ((int) (number1 + number2)));
            case "-" -> System.out.println("Sum: " + ((int) (number1 - number2)));
            case "*" -> System.out.println("Sum: " + ((int) (number1 * number2)));
            case "/" -> System.out.println("Sum: " + (number1 / number2));
            default -> System.out.println("Invalid operator.");
        }
    }
}
