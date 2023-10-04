package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge7 {

    public static void main(String[] args) {
        int sideOne, sideTwo, sideThree, helpContor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        sideOne = scanner.nextInt();
        System.out.print("Enter the second side of the triangle: ");
        sideTwo = scanner.nextInt();
        System.out.print("Enter the third side of the triangle: ");
        sideThree = scanner.nextInt();

        System.out.println("");
        helpContor = (sideOne == sideTwo && sideTwo == sideThree) ? (helpContor = 2) : (sideTwo == sideThree || sideOne == sideTwo || sideOne == sideThree) ? (helpContor = 1) : (helpContor = 0);

        switch (helpContor) {
            case 0:
                System.out.println("The triangle is scalene.");
                break;
            case 1:
                System.out.println("The triangle is isosceles.");
                break;
            case 2:
                System.out.println("The triangle is equilateral.");
                break;
        }
    }
}
