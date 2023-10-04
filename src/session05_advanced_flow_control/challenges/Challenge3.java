package session05_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge3 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 3");
        System.out.println("");

        int numberOfElements;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        numberOfElements = scanner.nextInt();

        int[] array = new int[numberOfElements];
        System.out.println();
        for (int index = 0; index < numberOfElements; index++) {
            System.out.print("Enter element: ");
            array[index] = scanner.nextInt();
        }

        System.out.println("");
        System.out.println("The number of negative elements of your array is: " + numberOfNegative(array));

    }

    public static int numberOfNegative (int[] array) {
        int helpContor = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < 0) {
                helpContor++;
            }
        }
        return helpContor;
    }
}
