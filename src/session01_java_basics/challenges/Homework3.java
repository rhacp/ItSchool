package session01_java_basics.challenges;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Homework3 {

    public static void main(String[] args) {
        System.out.println("NUMBER 3");
        System.out.println("");

        String help;
        String help1;
        double help2;
        List<Double> numbers = new ArrayList<Double>();
        int a = 0;
        double s = 0;
        double d;
        double m = 1;
        double dv;

        //ArrayList<Double> numbers = new ArrayList<Double>(); Asa definim un ArrayList.
        //double[] numbers = new double[]; Asa definim un Array.
        //Array e cu [] si are size predefinit. Nu o poti initializa fara size.
        //Lista e cu <> si nu e necesar sa ii pui size.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        help = scanner.nextLine();

        help = " " + help; //!!!!!!!!!! 5 ore... !!!!!!!!!!!!!!
        help1 = help;
        help1 = help1.replaceAll("\\s", "");
        help2 = Integer.parseInt(help1);

        // "\\s" is empty space.

        for (int i = 0; i < help.length(); ++i) {
            if (Character.isWhitespace(help.charAt(help.length() - 1 - i))) {
                //numbers[i] = help2 % Math.pow(10, a); In caz de array care nu ma ajuta pt ca are size definit din start si eu nu stiu cat e la inceput.
                numbers.add(help2 % Math.pow(10, a));
                help2 = (help2 - help2 % Math.pow(10, a)) / Math.pow(10, a);
                a = 0;
            } else {
                ++a;
            }
        }

        //Math.pow e double si nu il pot converti in int, nici sa fac operatii cu el in int.

        d = numbers.get(numbers.size() - 1);
        dv = numbers.get(numbers.size() - 1);

        for (int j = 0; j < numbers.size(); ++j) {
            s = s + numbers.get(j);
            m = m * numbers.get(j);
        }

        for (int k = numbers.size() - 2; k >= 0; --k) {
            d = d - numbers.get(k);
            dv = dv / numbers.get(k);
        }

        //double s = numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3);
        //double d = numbers.get(3) - numbers.get(2) - numbers.get(1) - numbers.get(0);
        //double m = numbers.get(0) * numbers.get(1) * numbers.get(2) * numbers.get(3);

        System.out.println("");
        System.out.println("Sum: " + s);
        System.out.println("Dif: " + d);
        System.out.println("Mult: " + m);
        System.out.println("Div: " + dv);
    }
}
