package session8.challenges.challenge10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<LocalDate> test = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);

        if (test.size() == 0) {
            test.add(LocalDate.parse(scanner.nextLine(), formatter));
        }

        int helpcontor = 0;
        while (helpcontor < 5) {
            int secondHelp = 0;
            LocalDate date1 = LocalDate.parse(scanner.nextLine(), formatter);
            if (test.get(test.size() - 1).toEpochDay() < date1.toEpochDay()) {
                test.add(date1);
            } else {
                for (int index = test.size() - 1; index >= 0; index--) {
                    if (test.get(index).toEpochDay() < date1.toEpochDay()) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                test.add(secondHelp, date1);
                helpcontor++;
            }
        }
        System.out.println(test);
    }
}
