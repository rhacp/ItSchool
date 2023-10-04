package session09_java_oop_concepts.challenges.challenge01;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class CourseList {

    private ArrayList<Course> list = new ArrayList<>();

    public void addCourse(Course course) {
        list.add(course);
    }

    public void showAllCourses() {
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (Course element : list) {
            System.out.println(element.getType() + ", start time: " + element.getSchedule().format(formatterTime) + ", duration: " + element.getDuration());
        }
    }
}
