package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge14 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 14");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your line of code: ");
        inputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.println("The commments were removed: " + removeComments(inputValue));
    }

    public static StringBuilder removeComments (StringBuilder input) {
        StringBuilder rez = new StringBuilder();
        String help, help1;
        rez.append(input.toString().replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",""));
        return rez;
    }
}
