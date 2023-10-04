package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge09 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 9");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());

        System.out.println();
        frequencyOfCharacter(inputValue);
    }

    public static void frequencyOfCharacter (StringBuilder input) {
        //List<Character> myArray = new ArrayList<>();
        char[] myArray = input.toString().toCharArray();
        int helpCounter = 0;
        char helpChar;
        for (int index = 0; index < input.length(); index++) {
            helpChar = myArray[index];
            for (int secondIndex = 0; secondIndex < input.length(); secondIndex++) {
                if (myArray[index] == myArray[secondIndex]) {
                    helpCounter++;
                }
            }
            System.out.println("The frequency of the '" + myArray[index] + "' character is: " + helpCounter);
            helpCounter = 0;
        }
    }
}
