package session8.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge01 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 1");
        System.out.println("---");
        System.out.println("");

        int length;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        length = Integer.parseInt(scanner.nextLine());
//        scanner.close();
        System.out.println("");
        String[] shoppingList = new String[length];
//        Scanner newscanner = new Scanner(System.in);

        for (int index = 0; index < shoppingList.length; index++) {
            System.out.print("Enter your shopping item: ");
            shoppingList[index] = scanner.nextLine();
            System.out.println("");
        }
        scanner.close();
//        newscanner.close();
        System.out.println("Your shopping list is: ");
        System.out.println(Arrays.toString(shoppingList));
    }
}
