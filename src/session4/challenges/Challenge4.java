package session4.challenges;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {
        int heightOne, heightTwo, maximumHeight;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first height: ");
        heightOne = scanner.nextInt();
        System.out.print("Enter the second height: ");
        heightTwo = scanner.nextInt();

        System.out.println("");
        maximumHeight = (heightOne >= heightTwo) ? heightOne : heightTwo;
        System.out.println("The bigger height is: " + maximumHeight);
    }
}
