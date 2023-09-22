package session6.challenges;

import java.io.*;
import java.util.Collections;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Challenge15 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 15");
        System.out.println("---");
        System.out.println("");

        StringBuilder firstInputValue = new StringBuilder();
        StringBuilder secondInputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first  word/sentence: ");
        firstInputValue.append(scanner.nextLine());
        System.out.println("");
        System.out.print("Enter your second  word/sentence: ");
        secondInputValue.append(scanner.nextLine());
        scanner.close();

        System.out.println("");
        if (areAnagrams(firstInputValue, secondInputValue) == true) {
            System.out.println("Anagrams.");
        } else {
            System.out.println("Not anagrams.");
        }
    }

    public static boolean areAnagrams (StringBuilder firstInput, StringBuilder secondInput) {
        if (firstInput.length() != secondInput.length()) {
            return false;
        } else {
            char[] firstHelp = firstInput.toString().toCharArray();
            char[] secondHelp = secondInput.toString().toCharArray();
            Arrays.sort(firstHelp);
            Arrays.sort(secondHelp);
            if (Arrays.equals(firstHelp, secondHelp)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
