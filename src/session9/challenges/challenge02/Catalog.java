package session9.challenges.challenge02;

import session9.challenges.challenge02.Student;

import java.util.ArrayList;

public class Catalog {

    private ArrayList<Student> catalog = new ArrayList<>();

    public void addStudent(session9.challenges.challenge02.Student student) {
        if (catalog.size() == 0) {
            catalog.add(student);
        } else {
            int helpCounter = 0;
            for (Student element : catalog) {
                if (element.equals(student)) {
                    System.out.println("The student already exist. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = catalog.size() - 1; index >= 0; index--) {
                    if ((catalog.get(index).getName()).compareToIgnoreCase(student.getName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                catalog.add(secondHelp, student);
            }
        }
    }

    public void showAllStudents() {
        for (int index = 0; index < catalog.size(); index++) {
            System.out.println(catalog.get(index).getName() + ", ID: " + catalog.get(index).getUUID());
            catalog.get(index).getClassesAndGrades();
            System.out.println("");
        }
    }

    public Student getStudent(String name){
        int helpCounter = 0;
        for (Student element : catalog){
            if ((element.getName()).equals(name)){
                helpCounter = 1;
                return element;
            }
        }

        if (helpCounter == 0) {
            System.out.println("Student does not exist. Try again.");
        }
        return null;
    }
}

