package session18.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem05 {

    public static void main(String[] args) {
        String start = "Java is very fun";
        String[] help = start.split(" ");

        for (int index = help.length - 1; index >= 0; index--){
            System.out.print(help[index] + " ");
        }

        System.out.println(" ");
        Collections.reverse(Arrays.asList(help));
        System.out.println(Arrays.asList(help));
    }
}
