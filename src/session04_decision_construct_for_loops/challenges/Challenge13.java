package session04_decision_construct_for_loops.challenges;

import java.util.Scanner;

public class Challenge13 {

    public static void main(String[] args) {
        boolean isSunny, isRaining;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it raining today?");
        isRaining = scanner.nextBoolean();
        isSunny = !isRaining;
        System.out.println("Then is it sunny today?");
        System.out.println(isSunny);
        System.out.println("");

        isSunny = !isSunny;
        isRaining = !isRaining;
        System.out.println("Will it rain the next day?");
        System.out.println(isRaining);
        System.out.println("Then will it be sunny?");
        System.out.println(isSunny);
    }
}
