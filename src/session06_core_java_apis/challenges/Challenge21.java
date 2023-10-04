package session06_core_java_apis.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge21 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 21");
        System.out.println("---");
        System.out.println("");

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        num = scanner.nextInt();
        System.out.println("");
        System.out.println("Your number converted to roman is: " + intToRoman(num));
    }

    static String intToRoman(int num) {
        String s = "";
        String f;
        //int contor = 0;
        List<Integer> help = new ArrayList<Integer>();
        List<String> res = new ArrayList<String>();
        while (num > 0) {
            if (num % 10 == 0)
                if (num % 100 == 0)
                    if (num % 1000 == 0) {
                        help.add(1000);
                        num = num  - 1000;
                    }
                    else {
                        if (num % 500 == 0) {
                            help.add(500);
                            num = num  - 500;
                        }
                        else {
                            help.add(100);
                            num = num - 100;
                        }
                    }
                else {
                    if (num % 50 == 0) {
                        help.add(50);
                        num = num  - 50;
                    }
                    else {
                        help.add(10);
                        num = num - 10;
                    }
                }
            else {
                if (num % 5 == 0) {
                    help.add(5);
                    num = num  - 5;
                }
                else {
                    help.add(1);
                    num = num - 1;
                }
            }
        }
        for (int i = help.size() - 1; i >= 0; i--) {
            switch (help.get(i)) {
                case 1000:
                    s += "M";
                    break;
                case 500:
                    s += "D";
                    break;
                case 100:
                    s += "C";
                    break;
                case 50:
                    s += "L";
                    break;
                case 10:
                    s += "X";
                    break;
                case 5:
                    s += "V";
                    break;
                case 1:
                    s += "I";
                    break;
            }
        }

        f = s.replaceAll("VIIII", "IX")
                .replaceAll("LXXXX", "XC")
                .replaceAll("DCCCC", "CM")
                .replaceAll("XXXX", "XL")
                .replaceAll("LXXXX", "XC")
                .replaceAll("DCCCC", "CM")
                .replaceAll("XXXX", "XL")
                .replaceAll("IIII", "IV")
                .replaceAll("CCCC", "CD");

        return f;
    }
}