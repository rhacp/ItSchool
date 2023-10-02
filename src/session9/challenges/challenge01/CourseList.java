package session9.challenges.challenge01;

import java.util.ArrayList;

public class CourseList {

    private ArrayList<Course> list = new ArrayList<>();

    public void addCourse(Course course) {
        list.add(course);
    }

    public void showAllCourses() {
        for (Course element : list) {
            System.out.println(element.getType() + ", start time: " + element.getSchedule() + ", duration: " + element.getDuration());
        }
    }
}
