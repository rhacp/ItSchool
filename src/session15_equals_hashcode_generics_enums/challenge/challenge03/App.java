package session15_equals_hashcode_generics_enums.challenge.challenge03;

public class App {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        System.out.println("First student created:");
        firstStudent.setName("Marcel");
        firstStudent.setAge((short) 20);
        firstStudent.setEmail("marcel@gmail.com");
        System.out.println("");

        Student secondStudent = new Student();
        System.out.println("Second student created:");
        secondStudent.setName("Marcel");
        secondStudent.setAge((short) 20);
        secondStudent.setEmail("marcel@gmail.com");
        System.out.println("");

        System.out.println("Only HashCode implemented, no equals method.");
        System.out.println("");
        System.out.println("firstStudent equals secondStudent: " + firstStudent.equals(secondStudent));
        System.out.println("firstStudent hashCode: " + firstStudent.hashCode());
        System.out.println("secondStudent hashCode: " + secondStudent.hashCode());
    }
}
