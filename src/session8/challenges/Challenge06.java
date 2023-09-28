package session8.challenges;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Challenge06 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 6");
        System.out.println("---");
        System.out.println("");

        Scanner newscanner = new Scanner(System.in);
        List<String> students = new LinkedList<>();
        readStudents(students, newscanner);
//        List<String> students = new LinkedList(readStudents());

        checkAndRemove(students, newscanner);
        System.out.println(" ");
        System.out.println("The updates list of students is: ");
        System.out.println(students);
        newscanner.close();

    }

    private static void readStudents(List<String> list, Scanner scanner) {
        int index = 0;
        FIRST:
        while (true) {
            System.out.print("Enter your student (0 will stop the process): ");
            list.add(scanner.nextLine());
            System.out.println("");

            if (list.get(index).equals("0")) {
                list.remove(index);
                break FIRST;
            }
            index++;
        }
    }

    private static void checkAndRemove(List<String> list, Scanner scanner) {
        System.out.print("Enter student to search for and remove: ");
        String help;
        help = scanner.nextLine();
        while (list.contains(help) == false) {
            System.out.print("The student does not exist in the list. Please input again the student to search for: ");
            help = scanner.nextLine();
        }
        System.out.println("The student exists in the list. It will be removed!");
        list.remove(help);
    }
}
