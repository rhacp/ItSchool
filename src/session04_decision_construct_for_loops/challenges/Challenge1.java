package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";
        System.out.println("String stringOne = OpenAI");
        System.out.println("String stringTwo = OpenAI");
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first string: ");
//        stringOne = scanner.nextLine();
//        System.out.print("Enter second string: ");
//        stringTwo = scanner.nextLine();

        System.out.println("Do the first and second strings refer to the same object? ");
        System.out.println(stringTwo == stringOne);

        System.out.println("");
        String stringThree = new String("OpenAI");
        String stringFour = new String("OpenAI");
        System.out.println("new stringThree = OpenAI (custom object)");
        System.out.println("new stringFour = OpenAI (custom object)");
//        System.out.print("Enter third string: ");
//        stringThree = scanner.nextLine();
//        System.out.print("Enter fourth string: ");
//        stringFour = scanner.nextLine();

        System.out.println("Do the two strings refer to the same object? ");
        System.out.println(stringThree == stringFour);
    }
}
