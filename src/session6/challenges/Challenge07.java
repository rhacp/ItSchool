package session6.challenges;

import java.util.Scanner;

public class Challenge07 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 7");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.println("The duplicate letters were removed: " + removeDuplicateLetters(inputValue));
    }

    public static StringBuilder removeDuplicateLetters (StringBuilder input) {
        String helpChar;
        input.append(" ");
        int  indexHelp = 0;
        StringBuilder helpString = new StringBuilder();
        for (int index  = 1;  index < input.length(); index++) {
            helpChar = input.substring(indexHelp, index);
            if (helpString.indexOf(helpChar) < 0) {
                helpString.append(helpChar);
            }
            indexHelp++;
        }
        return helpString;
    }
}
