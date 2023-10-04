package session10.challenges.challenge06.single_inheritance;

public class Bicycle {

    private int speed;
    private String gear;

    public void changeGear(String gear) {
        this.gear = gear;
    }

    public void speedUp(int amount) {
        if (amount > 0) {
            speed += amount;
            System.out.println("The speed was increased with: " + amount);
        } else {
            System.out.println("Invalid value.");
        }
    }

    public void applyBrake(int amount) {
        if (amount > 0 && amount < speed) {
            speed -= amount;
            System.out.println("The speed was decreased with: " + amount);
        } else {
            System.out.println("Invalid value.");
        }
    }
}
