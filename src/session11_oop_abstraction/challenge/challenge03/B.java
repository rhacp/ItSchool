package session11_oop_abstraction.challenge.challenge03;

import java.util.ArrayList;

public class B extends Marks {

    private ArrayList<Integer> marks = new ArrayList<>();

    public B(int firstMark, int secondMark, int thirdMark, int forthMark) {
        if (firstMark >= 0 && firstMark <= 100 && secondMark >= 0 && secondMark <= 100 && thirdMark >= 0 && thirdMark <= 100 && forthMark >= 0 && forthMark <= 100) {
            marks.add(firstMark);
            marks.add(secondMark);
            marks.add(thirdMark);
            marks.add(forthMark);
        } else {
            System.out.println("The grades are not between 0 and 100. Repeat the grades assignment.");
        }
    }

    @Override
    public int getPercentage() {
        int sum = marks.get(0) + marks.get(1) + marks.get(2) + marks.get(3);
        return (sum / 4);
    }
}
