package session04_decision_construct_for_loops.challenges;

import java.util.Arrays;

public class Challenge18 {

    public static void main(String[] args) {
        int[] array = new int[5];
        for(int index = 0; index < array.length; index++) {
            array[index] = index + 1;
        }
        System.out.print("Array: ");
        for (int element: array) {
            System.out.print(element + " ");
        }
        System.out.println("");
        System.out.println("");

        for(int index1 = 0; index1 < array.length; index1++) {
            array[index1] = --array[index1];
        }
        System.out.print("Array decremented by 1: ");
        System.out.println(Arrays.toString(array));
    }
}
