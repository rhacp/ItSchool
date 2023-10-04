package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge10 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 10");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.println("Your message converted to Morse code is: " + convertToMorse(inputValue));
    }

    public static StringBuilder convertToMorse(StringBuilder input) {
        StringBuilder rez = new StringBuilder();
        String helpString = input.toString().toUpperCase();
        for (int index = 0; index < helpString.length(); index++) {
            char help = helpString.charAt(index);
            switch (help) {
                case 'A' -> rez.append(".- ");
                case 'B' -> rez.append("-... ");
                case 'C' -> rez.append("-.-.");
                case 'D' -> rez.append("-.. ");
                case 'E' -> rez.append(". ");
                case 'F' -> rez.append("..-. ");
                case 'G' -> rez.append("--. ");
                case 'H' -> rez.append(".... ");
                case 'I' -> rez.append(".. ");
                case 'J' -> rez.append(".--- ");
                case 'K' -> rez.append("-.- ");
                case 'L' -> rez.append(".-.. ");
                case 'M' -> rez.append("-- ");
                case 'N' -> rez.append("-. ");
                case 'O' -> rez.append("--- ");
                case 'P' -> rez.append(".--. ");
                case 'Q' -> rez.append("--.- ");
                case 'R' -> rez.append(".-. ");
                case 'S' -> rez.append("... ");
                case 'T' -> rez.append("- ");
                case 'U' -> rez.append("..- ");
                case 'V' -> rez.append("...- ");
                case 'W' -> rez.append(".-- ");
                case 'X' -> rez.append("-..- ");
                case 'Y' -> rez.append("-.-- ");
                case 'Z' -> rez.append("--.. ");
                case '0' -> rez.append("----- ");
                case '1' -> rez.append(".---- ");
                case '2' -> rez.append("..--- ");
                case '3' -> rez.append("...-- ");
                case '4' -> rez.append("....- ");
                case '5' -> rez.append("..... ");
                case '6' -> rez.append("-.... ");
                case '7' -> rez.append("--... ");
                case '8' -> rez.append("---.. ");
                case '9' -> rez.append("----. ");
                case ' ' -> rez.append("/ ");
                case '.' -> rez.append(".-.-.-");
                case ',' -> rez.append("--..--");
                case '?' -> rez.append("..--..");
                case '\'' -> rez.append(".----.");
                case '!' -> rez.append("-.-.--");
                case '/' -> rez.append("-..-.");
                case '(' -> rez.append("-.--.");
                case ')' -> rez.append("-.--.-");
                case '&' -> rez.append(".-...");
                case ':' -> rez.append("---...");
                case ';' -> rez.append("-.-.-.");
                case '=' -> rez.append("-...-");
                case '+' -> rez.append(".-.-.");
                case '-' -> rez.append("-....-");
                case '_' -> rez.append("..--.-");
                case '\"' -> rez.append(".-..-.");
                case '$' -> rez.append("...-..-");
                case '@' -> rez.append(".--.-.");
                case '¿' -> rez.append("..-.-");
                case '¡' -> rez.append("--...-");
                default -> rez.append("#");
            }
        }
        return rez;
    }
}
