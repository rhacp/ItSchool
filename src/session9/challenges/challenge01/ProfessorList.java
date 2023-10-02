package session9.challenges.challenge01;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ProfessorList {

    private ArrayList<Professor> professorList = new ArrayList<>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public void addProfessor(Professor professor) {
        if (professorList.size() == 0) {
            professorList.add(professor);
        } else {
//            int helpCounter = 0;
            for (Professor element : professorList) {
                if (element.equals(professor)) {
                    System.out.println("The professor already exist. Please try again.");
//                    helpCounter = 1;
                    break;
                }
            }

            int secondHelp = 0;
            for (int index = professorList.size() - 1; index >= 0; index--) {
                if ((professorList.get(index).getFirstName()).compareToIgnoreCase(professor.getFirstName()) < 0) {
                    secondHelp = index + 1;
                    break;
                }
            }
            professorList.add(secondHelp, professor);
        }
    }

    public void showAllProfessors() {
        for (int index = 0; index < professorList.size(); index++) {
            System.out.println(professorList.get(index).getFirstName() + " " + professorList.get(index).getLastName());
        }
    }

    public Professor findProfessorByName(String professor) {
        int help = -1, helpIndex = 0;
        for (int index = 0; index < professorList.size(); index++) {
            if ((professorList.get(index).getFirstName()).equals(professor)) {
                helpIndex = index;
                help = 1;
                break;
            }
        }
        if (help == -1) {
            System.out.println("The professor does not exist. Please try again.");
        } else if (help == 1) {
            return professorList.get(helpIndex);
        }
        return null;
    }
}
