package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge01 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 1");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new  StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.print("Your reversed String is: " +  reverseStringBuilder(inputValue));
    }

    public static StringBuilder reverseStringBuilder(StringBuilder  input) {
        StringBuilder rez = new StringBuilder();
        rez = input.reverse();
        return  rez;
    }
}
