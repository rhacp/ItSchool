package session08_array_arraylist_linkedlist_wrapperclass.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("John");

        names.add(1, "Frank");

        System.out.println(names);
        System.out.println("");

        if (names.isEmpty()) {
            System.out.println("Names list is empty");
        } else {
            System.out.println("Names list is not empty. it has " + names.size() + " elements");
        }

        System.out.println("");
        String firstElement = names.get(0);
        System.out.println("First element from names: " + firstElement);
    }
}
