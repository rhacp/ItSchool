package session8.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Challenge02 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 2");
        System.out.println("---");
        System.out.println("");

        int index = 0;
        ArrayList<String> christmas = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Enter your element in the Christmas wishlist (0 will stop the process): ");
            christmas.add(scanner.nextLine());
            System.out.println("");

            if (christmas.get(index).equals("0")) {
                christmas.remove(index);
                break;
            }
            index++;
        }

        System.out.println("Your Christmas wishlist is: ");
        System.out.println(christmas);
    }
}
