package session1.practice;

import java.util.Scanner;

public class User {

    static String firstName = "John";
    static String lastName = "Doe";
    static String email = "john@gmail.com";
    static String password = "12345678";
    static byte age = 34;
    static boolean isMajor = true;

    public static void main(String[] args) {
        System.out.println(firstName);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please tell me your name!");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!");
        scanner.close();
    }
}