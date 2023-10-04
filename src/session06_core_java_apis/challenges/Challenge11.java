package session06_core_java_apis.challenges;

import java.util.Scanner;

import static java.lang.Character.*;

public class Challenge11 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 11");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        int shiftValue;
        inputValue.append(scanner.nextLine());
        System.out.print("Enter the shift value for the Cesar Cipher conversion: ");
        shiftValue = scanner.nextInt();
        System.out.println("");

        int menu;
        System.out.println("Do you want to encode or decode?");
        System.out.println("0 - encode; 1 - decode");
        menu = scanner.nextInt();
        System.out.println("");
        while (menu != 1 && menu != 0) {
            System.out.println("You need to choose either 0 for encode or 1 for decode. Reenter value: ");
            menu = scanner.nextInt();
        }
        if (menu == 0) {
            System.out.println("");
            System.out.println("Your  encoded message with a shift of " + shiftValue + " is: " + cesarCipherEncoder(inputValue, shiftValue));
        } else if (menu == 1){
            System.out.println("");
            System.out.println("Your decoded message with a shift of " + shiftValue + " is: " + cesarCipherDecoder(inputValue, shiftValue));
        }
    }

    public static StringBuilder cesarCipherEncoder (StringBuilder input, int shift) {
        //char[] alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".toCharArray();
        //StringBuilder help = new StringBuilder(input.toString().replaceAll(" ", ""));
        StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
        StringBuilder rez = new StringBuilder();
        char helpCharacter;
        int   contor;
        for (int index = 0; index < input.length(); index++) {
            helpCharacter = input.charAt(index);
            if (isLetter(helpCharacter)) {
                contor = alphabet.toString().indexOf(helpCharacter);
                rez.append(alphabet.toString().charAt(contor + shift));
            } else {
                rez.append(helpCharacter);
            }
        }
        return   rez;
    }

    public static StringBuilder cesarCipherDecoder (StringBuilder input, int shift) {
        //char[] alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz".toCharArray();
        //StringBuilder help = new StringBuilder(input.toString().replaceAll(" ", ""));
        StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        StringBuilder alphabetUpper = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ");
        StringBuilder rez = new StringBuilder();
        char helpCharacter;
        int   contor;
        for (int index = 0; index < input.length(); index++) {
            helpCharacter = input.charAt(index);
            if (isLowerCase(helpCharacter)) {
                contor = 26 + alphabet.toString().indexOf(helpCharacter);
                rez.append(alphabet.toString().charAt(contor - shift));
            } else if (isUpperCase(helpCharacter)) {
                contor = alphabetUpper.toString().indexOf(helpCharacter);
                rez.append(alphabetUpper.toString().charAt(contor - shift));
            } else {
                rez.append(helpCharacter);
            }
        }
        return   rez;
    }
}
