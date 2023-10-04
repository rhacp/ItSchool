package session05_advanced_flow_control.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge8 {

    public static void main(String[] args) {
        System.out.println("CHALLENGE 8");
        System.out.println("");

        System.out.println(fibonacciFirst10().toString());
    }

    public static List<Integer> fibonacciFirst10() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        for (int index = 2; index <= 9; index ++) {
            list.add(list.get(index - 2) + list.get(index - 1));
        }
        return list;
    }
}
