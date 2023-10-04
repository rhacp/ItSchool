package session06_core_java_apis.challenges;

import java.util.Scanner;

public class Challenge20 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 20");
        System.out.println("---");
        System.out.println("");

        StringBuilder firstInputValue = new StringBuilder();
        StringBuilder patternValue = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        firstInputValue.append(scanner.nextLine());

        System.out.println("");
        if (checkParenthesis(firstInputValue) == true) {
            System.out.println("Your parenthesis are balanced.");
        } else {
            System.out.println("Your parenthesis are not balanced.");
        }
    }

    public static boolean checkParenthesis(StringBuilder input) {
        boolean help = true;

//        int firstHelp = 0, secondHelp = 0, thirdHelp = 0, fourthHelp = 0, fifthHelp = 0, sixthHelp = 0;
//        for (int index = 0; index < input.length(); index++) {
//            switch (input.charAt(index)) {
//                case '(' -> firstHelp++;
//                case ')' -> secondHelp++;
//                case '[' -> thirdHelp++;
//                case ']' -> fourthHelp++;
//                case '{' -> fifthHelp++;
//                case '}' -> sixthHelp++;
//            }
//        }
//        if(firstHelp ==secondHelp &&thirdHelp ==fifthHelp &&fifthHelp == sixthHelp) {
//            return true;
//        } else {
//            return false;
//        }

        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == '(') {
                if (input.substring(index, input.length()).toString().indexOf(')') == -1) {
                    help = false;
                    break;
                }
            }
            if (input.charAt(index) == '[') {
                if (input.substring(index, input.length()).toString().indexOf(']') == -1) {
                    help = false;
                    break;
                }
            }
            if (input.charAt(index) == '{') {
                if (input.substring(index, input.length()).toString().indexOf('}') == -1) {
                    help = false;
                    break;
                }
            }
        }
        return help;
    }
}
