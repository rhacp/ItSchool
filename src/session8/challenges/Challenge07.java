package session8.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Challenge07 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 7");
        System.out.println("---");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();

        readList(fruits, scanner);
        System.out.println("");

        sortList(fruits);
        System.out.println("Your sorted list is: ");
        System.out.println(fruits);
    }

    private static void readList(ArrayList<String> list, Scanner scanner) {
        int index = 0;
        FIRST:
        while (true) {
            System.out.print("Enter your fruit (0 will stop the process): ");
            list.add(scanner.nextLine());
            System.out.println("");

            if (list.get(index).equals("0")) {
                list.remove(index);
                break FIRST;
            }
            index++;
        }
    }

    public static void sortList(ArrayList<String> arrayList) {
//        Collections.sort(arrayList);
//        Cum testez codul ca sa vad care e mai optim? Intre varianta 1 si 2.
        for(int index = 0; index < arrayList.size(); index++) {
            for (int secondIndex = index + 1; secondIndex < arrayList.size(); secondIndex++) {
                if (arrayList.get(secondIndex).length() > arrayList.get(index).length()) {
                    String help = arrayList.get(index);
                    arrayList.set(index, arrayList.get(secondIndex));
                    arrayList.set(secondIndex, help);
                }
                if (arrayList.get(secondIndex).length() == arrayList.get(index).length()) {
                    if ((arrayList.get(secondIndex).compareTo(arrayList.get(index))) < 0) {
                        String help = arrayList.get(index);
                        arrayList.set(index, arrayList.get(secondIndex));
                        arrayList.set(secondIndex, help);
                    }
                }
            }
        }
    }
}
