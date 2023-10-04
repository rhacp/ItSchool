package session04_decision_construct_for_loops.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int elementsNumber;
        System.out.print("Enter the list number of elements: ");
        elementsNumber = scanner.nextInt();

        System.out.println("");
        for (int index = 0; index <= (elementsNumber - 1); index++) {
            System.out.print("Enter element: ");
            firstList.add(scanner.nextInt());
        }

        System.out.println("");
        List<Integer> secondList = new ArrayList<Integer>(firstList);
        System.out.print("Element to add to the list: ");
        firstList.add(scanner.nextInt());

        System.out.println(" ");
        System.out.println("Final list:");
        for (int index1 = 0; index1 < firstList.size(); index1++) {
            System.out.print(firstList.get(index1) + " ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Copy of the initial list:");
        for (int index2 = 0; index2 < secondList.size(); index2++) {
            System.out.print(secondList.get(index2) + " ");
        }
    }
}
