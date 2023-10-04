package session05_advanced_flow_control.challenges;

import java.util.Scanner;

public class Challenge9 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 9");
        System.out.println("");

        int arrayLimit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your array number of elements: ");
        arrayLimit = scanner.nextInt();
        int[] array = new int[arrayLimit];
        System.out.println("");

        for (int index = 0; index < arrayLimit; index++) {
            System.out.print("Enter array  element: ");
            array[index] = scanner.nextInt();
        }
        System.out.println("");

        for (int element : array) {
            checkEvenOrOdd(element);
        }

    }

    public static void checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.print(number + " Even");
            System.out.println("");
        }
        else {
            System.out.print(number + " Odd");
            System.out.println("");
        }
    }
}
