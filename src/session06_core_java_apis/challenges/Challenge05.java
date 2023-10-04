package session06_core_java_apis.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge05 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 4");
        System.out.println("---");
        System.out.println("");

        StringBuilder inputValue = new  StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your String: ");
        inputValue.append(scanner.nextLine());

        System.out.println("");
        System.out.println(capitalizeFirstLetterOfEachWord(inputValue));
    }

    public static String capitalizeFirstLetterOfEachWord(StringBuilder input) {
//        String copy = String.valueOf(input);
//        String words[] = copy.split("\\s");
        List<String> words = new ArrayList<>();
        List<String> capitalWords = new ArrayList<>();
        String help = "";
        input.append(" ");
        int helpIndex = 0, helpIndexSecond = 0;
        for  (int  index = 0; index < input.length(); index++) {
            if (input.charAt(index) == ' ') {
                if (!input.substring(helpIndex, index).equals("")) {
                    words.add(input.substring(helpIndex, index).toString());
                }
                helpIndex = index + 1;
            }
        }
        for (String element : words) {
            help += element.substring(0,1).toUpperCase();
            help += element.substring(1,element.length());
            help += " ";
        }
        return help;
    }
}
