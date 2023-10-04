package session10.challenges.challenge06.multilevel_inheritance;

public class Tesla extends ElectricCar{

    private boolean autopilotVersion;

    public void enableAutopilot() {
        autopilotVersion = true;
        System.out.println("The auto pilot was enabled.");
    }
}
