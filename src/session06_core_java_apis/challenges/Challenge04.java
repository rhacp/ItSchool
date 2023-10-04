package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge04 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 4");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new  StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());

        System.out.println("All vowels were removed from your string: " + removeVowels(inputValue));
    }

    public static String removeVowels(StringBuilder input) {
        String rez = (input.toString().replaceAll("[aeiouAEIOU]", ""));
        return rez;
    }
}
