package session6.challenges;

import java.util.Scanner;

public class Challenge8 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 8");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        StringBuilder toAddValue = new StringBuilder();
        int indexValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());
        System.out.print("Enter your String to add: ");
        toAddValue.append(scanner.nextLine());
        System.out.println("Enter the index you want your string to be added at:");
        indexValue = scanner.nextInt();

        System.out.println("");
        System.out.println("Result: " + addStringAtIndex(inputValue, toAddValue, indexValue));
    }

    public static StringBuilder addStringAtIndex (StringBuilder input, StringBuilder toAdd, int index) {
        StringBuilder rez = new StringBuilder();
        rez.append(input.substring(0,index + 1));
        rez.append(toAdd);
        rez.append(input.substring(index + 1, input.length()));
        return rez;
    }
}
