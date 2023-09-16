package session5.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 5");
        System.out.println("");

        int limitValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want printed from the Fibonacci series: ");
        limitValue = scanner.nextInt();

        System.out.println("");
        System.out.println(fibonacciPrint(limitValue).toString());
    }

    public static List<Integer> fibonacciPrint(int limit) {
        int helpContor = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        while (helpContor <= limit) {
            list.add(list.get(helpContor) + list.get(helpContor + 1));
            helpContor++;
        }
        return list;
    }
}
