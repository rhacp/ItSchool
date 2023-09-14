package session4.challenges;

import java.util.Scanner;

//import static java.lang.Math.abs;

public class Challenge16 {

    public static void main(String[] args) {
        int variable;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter variable value: ");
        variable = scanner.nextInt();
        System.out.println("");

        variable = -variable;
        System.out.println("-variable = " + variable);
        System.out.println("");

        //variable = abs(variable);
        variable = -variable;
        System.out.println("-(-variable) = " + variable);
        System.out.println("");

        variable++;
        System.out.println("-(-value) + 1 = " + variable);
    }
}
