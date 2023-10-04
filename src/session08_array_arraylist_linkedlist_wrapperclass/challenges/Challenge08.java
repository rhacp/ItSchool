package session08_array_arraylist_linkedlist_wrapperclass.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge08 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 8");
        System.out.println("---");
        System.out.println("");

        int length;
        String searchValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        length = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        String[] movieList = new String[length];

        for (int index = 0; index < movieList.length; index++) {
            System.out.print("Enter your movie item: ");
            movieList[index] = scanner.nextLine();
            System.out.println("");
        }

        System.out.print("Enter movie to search for: ");
        searchValue = scanner.nextLine();
        scanner.close();

        System.out.println("");
        search(movieList, searchValue);
    }

    public static void search(String[] array, String search) {
        Arrays.sort(array);
        int help = Arrays.binarySearch(array, search);
        if (help < 0) {
            System.out.println("The movie is not present in your list.");
        } else {
            System.out.println("The movie is present in your list at the position number " + (help + 1));
        }
    }
}
