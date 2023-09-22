package session6.challenges;

import java.util.Scanner;

public class Challenge06 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 6");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        StringBuilder toReplaceValue = new StringBuilder();
        StringBuilder replacementValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());
        System.out.println("");
        System.out.print("Enter the substring to replace: ");
        toReplaceValue.append(scanner.nextLine());
        System.out.println("");
        System.out.print("Enter your replacement: ");
        replacementValue.append(scanner.nextLine());
        scanner.close();

        System.out.println("");
        System.out.println("The result is: " + replaceSubstring(inputValue, toReplaceValue, replacementValue));
    }

    public static String  replaceSubstring(StringBuilder input, StringBuilder toReplace, StringBuilder replacement){
        String help = input.toString();
        String rez;
        rez = help.replaceAll(toReplace.toString(), replacement.toString());
        return rez;
    }
}
