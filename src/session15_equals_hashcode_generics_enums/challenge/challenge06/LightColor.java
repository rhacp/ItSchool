package session15_equals_hashcode_generics_enums.challenge.challenge06;

public enum LightColor {

    RED("Stop", (short) 120),
    YELLOW("Caution", (short) 30),
    GREEN("Go", (short) 50);

    private String representation;

    private short durationInSeconds;

    LightColor(String representation, short durationInSeconds) {
        this.representation = representation;
        this.durationInSeconds = durationInSeconds;
    }

    public String getRepresentation() {
        return representation;
    }

    public short getDurationInSeconds() {
        return durationInSeconds;
    }
}
