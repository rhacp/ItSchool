package session8.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge05 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 5");
        System.out.println("---");
//        System.out.println("");

        ArrayList<String> cityNames = new ArrayList<>();
        readCountries(cityNames);

        System.out.println("");
        System.out.println("Your list of countries is: ");
        System.out.println(cityNames);
    }

    private static void readCountries(ArrayList<String> cityNames) {
        int index = 0;
        String help;
        Scanner scanner = new Scanner(System.in);
        FIRST:
        while (true) {
            System.out.println("");
            System.out.print("Enter your countries (0 will stop the process): ");
            help = scanner.nextLine();
            while (cityNames.contains(help) == true) {
                System.out.print("This country is already on the list. Enter again the value: ");
                help = scanner.nextLine();
            }
            cityNames.add(help);

            if (cityNames.get(index).equals("0")) {
                cityNames.remove(index);
                break;
            }
            index++;
        }
        scanner.close();
    }
}
