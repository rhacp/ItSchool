package session10_java_oop_inheritance_encapsulation.challenges.challenge06.single_inheritance;

public class MountainBike extends Bicycle{

    private String tireType;
    private String suspension;

    public void adjustSuspension(String suspension) {
        this.suspension = suspension;
        System.out.println("The suspension were adjusted as it follows: " + suspension);
    }
}
