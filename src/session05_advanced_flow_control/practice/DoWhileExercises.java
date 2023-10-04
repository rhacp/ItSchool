package session05_advanced_flow_control.practice;

public class DoWhileExercises {

    public static void main(String[] args) {
        printNumbers();
        System.out.println("");
        System.out.println("");
        printReverseCounter();
    }

    public static void printNumbers() {
        int number = 1;
        do {
            System.out.print(number + " ");
            number++;
        } while (number < 11);
    }

    public static void printReverseCounter() {
        int number = 10;
        do {
            System.out.print(number + " ");
            number--;
        } while (number >= 1);
    }
}
