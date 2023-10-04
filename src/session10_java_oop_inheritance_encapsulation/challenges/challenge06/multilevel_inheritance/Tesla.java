package session10_java_oop_inheritance_encapsulation.challenges.challenge06.multilevel_inheritance;

public class Tesla extends ElectricCar{

    private boolean autopilotVersion;

    public void enableAutopilot() {
        autopilotVersion = true;
        System.out.println("The auto pilot was enabled.");
    }
}
