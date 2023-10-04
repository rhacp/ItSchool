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
        } else {
            System.out.println("Invalid value.");
        }
    }

    public void applyBrake(int amount) {
        if (amount > 0 && amount < speed) {
            speed -= amount;
        } else {
            System.out.println("Invalid value.");
        }
    }
}
