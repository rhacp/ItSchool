package session15_equals_hashcode_generics_enums.challenge.challenge06;

public class App {

    public static void main(String[] args) {
        System.out.println(LightColor.GREEN + " " + LightColor.GREEN.getDurationInSeconds() + " " + LightColor.GREEN.getRepresentation());
        System.out.println(LightColor.RED + " " + LightColor.RED.getDurationInSeconds() + " " + LightColor.RED.getRepresentation());
        System.out.println(LightColor.YELLOW + " " + LightColor.YELLOW.getDurationInSeconds() + " " + LightColor.YELLOW.getRepresentation());
    }
}
