package session11_oop_abstraction.challenge.challenge06;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rectangle length: ");
        int length = scanner.nextInt();
        System.out.print("Enter rectangle width: ");
        int width = scanner.nextInt();
        System.out.println("");
        System.out.print("Enter square side: ");
        int side = scanner.nextInt();
        System.out.println("");
        System.out.print("Enter circle radius: ");
        int radius = scanner.nextInt();
        System.out.println("");

        Area area = new Area();
        System.out.println("The rectangle area is: " + area.rectangleArea(length, width));
        System.out.println("The square area is: " + area.squareArea(side));
        System.out.println("The circle area is: " + area.circleArea(radius));
    }
}
