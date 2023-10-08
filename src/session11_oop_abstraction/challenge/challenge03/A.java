package session11_oop_abstraction.challenge.challenge03;

import java.util.ArrayList;

public class A extends Marks {

    private ArrayList<Integer> marks = new ArrayList<>();

    public A(int firstMark, int secondMark, int thirdMark) {
        if (firstMark >= 0 && firstMark <= 100 && secondMark >= 0 && secondMark <= 100 && thirdMark >= 0 && thirdMark <= 100) {
            marks.add(firstMark);
            marks.add(secondMark);
            marks.add(thirdMark);
        } else {
            System.out.println("The grades are not between 0 and 100. Repeat the grades assignment.");
        }
    }

    @Override
    public int getPercentage() {
        int sum = marks.get(0) + marks.get(1) + marks.get(2);
        return (sum / 3);
    }
}
