package session8.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge04 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 4");
        System.out.println("---");
        System.out.println("");

        int[] arrayValue = new int[10];
        Scanner newscanner = new Scanner(System.in);

        for (int index = 0; index < arrayValue.length; index++) {
            System.out.print("Enter your first number to be added to the array: ");
            arrayValue[index] = newscanner.nextInt();
            System.out.println("");
        }

        countEvenAndOdd(arrayValue);
    }

    public static void countEvenAndOdd(int[] array){
        int oddCounter = 0, evenCounter = 0;
        for (int index = 0; index < array.length; index++) {
            if ((array[index] % 2) == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        System.out.println("There are " + evenCounter + " even numbers in your array.");
        System.out.println("There are " + oddCounter + " odd numbers in your array.");
    }
}
