package session9.challenges.challenge01;

import session9.challenges.challenge01.Student;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Catalog {

    private ArrayList<Student> catalog = new ArrayList<>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public void addStudent(Student student) {
        if (catalog.size() == 0) {
            catalog.add(student);
        } else {
//            int helpCounter = 0;
            for (Student element : catalog) {
                if (element.equals(student)) {
                    System.out.println("The student already exist. Please try again.");
//                    helpCounter = 1;
                    break;
                }
            }

            int secondHelp = 0;
            for (int index = catalog.size() - 1; index >= 0; index--) {
                if ((catalog.get(index).getFirstName()).compareToIgnoreCase(student.getFirstName()) < 0) {
                    secondHelp = index + 1;
                    break;
                }
            }

//            for (int index = 0; index < catalog.size(); index++) {
//                if ((catalog.get(index).getFirstName()).compareToIgnoreCase(student.getFirstName()) < 0) {
//                    secondHelp = index;
//                    break;
//                }
//            }
            catalog.add(secondHelp, student);
        }
    }

    public void showAllStudents() {
        for (int index = 0; index < catalog.size(); index++) {
            System.out.println(catalog.get(index).getFirstName() + " " + catalog.get(index).getLastName());
        }
    }
}
