package session08_array_arraylist_linkedlist_wrapperclass.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge03 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 3");
        System.out.println("---");
        System.out.println("");

        int index = 0;
        ArrayList<String> studentList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (index < 10){
            System.out.print("Enter your 10 students: ");
            studentList.add(scanner.nextLine());
            System.out.println("");
            index++;
        }

        copyAndPrintGraduate(studentList);
    }

    public static void copyAndPrintGraduate(ArrayList arrayList) {
        System.out.println("Graduate students: ");
        System.out.print("{ ");
        ArrayList<String> graduateStudentList = new ArrayList<>(arrayList);
        for (int index = 0; index < graduateStudentList.size(); index++) {
            if (index == 9) {
                System.out.print(graduateStudentList.get(index));
            } else {
                System.out.print(graduateStudentList.get(index) + ", ");
            }
        }
        System.out.println(" }");
    }
}
