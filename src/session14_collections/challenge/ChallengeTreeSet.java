package session14_collections.challenge;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ChallengeTreeSet {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        //deep-copy, not shallow!
        TreeSet<String> firstSetCopy = new TreeSet<>(treeSet);
        Scanner scanner = new Scanner(System.in);

        //CHALLENGE 01:
        addElement(treeSet, scanner);
        addElement(treeSet, scanner);
        addElement(treeSet, scanner);
        System.out.println(" ");

        //CHALLENGE 02:
        //Keeps the elements in their natural order by default.
        printElements(treeSet);
        System.out.println(" ");

        //CHALLENGE 03:
        TreeSet<String> secondSetCopy = new TreeSet<>(treeSet);
        System.out.println(secondSetCopy);
        System.out.println(getCopyTreeSet(treeSet));
        System.out.println(" ");

        //CHALLENGE 04:
        System.out.println(treeSet.descendingSet());
        printReverse(treeSet);
        System.out.println(" ");

        //CHALLENGE 05:
        printFirstAndLastElements(treeSet);
        System.out.println(" ");

        //CHALLENGE 06:
        TreeSet<String> thirdSetCopy = getSetCopy(treeSet);
        System.out.println(thirdSetCopy);
        System.out.println(treeSet);
        addElement(thirdSetCopy, scanner);
        System.out.println(thirdSetCopy);
        System.out.println(treeSet);
        System.out.println(" ");

        //CHALLENGE 07:
        System.out.println("Number of elements: " + treeSet.size());
        System.out.println("Number of elements: " + generic(treeSet));
        System.out.println(" ");

        //CHALLENGE 08:
    }

    //  CHALLENGE 07:
    private static <T> Integer generic(TreeSet<T> treeSet) {
        int result = 0;
        for (T element : treeSet) {
            result++;
        }

        return result;
    }

    //  CHALLENGE 06:
    private static <T> TreeSet<T> getSetCopy(TreeSet<T> treeSet) {
        TreeSet<T> copy = new TreeSet<>();

        //deep-copy, not shallow!
        copy = (TreeSet<T>) treeSet.clone();
        return copy;
    }

    //  CHALLENGE 05:
    private static <T> void printFirstAndLastElements(TreeSet<T> treeSet) {
        TreeSet<T> copy = getCopyTreeSet(treeSet);
        System.out.println("First element: " + copy.pollFirst());
        System.out.println("Last element: " + copy.pollLast());
    }

    //  CHALLENGE 04:
    private static <T> void printReverse(TreeSet<T> treeSet) {
        Iterator<T> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" ");
    }

    //  CHALLENGE 03:
    private static <T> TreeSet<T> getCopyTreeSet(TreeSet<T> treeSet) {
        TreeSet<T> copy = new TreeSet<>();
        for (T element : treeSet) {
            copy.add(element);
        }

        return copy;
    }

    //  CHALLENGE 02:
    private static <T> void printElements(TreeSet<T> treeSet) {
        for (T element : treeSet) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    //  CHALLENGE 01:
    private static <T> void addElement(TreeSet<T> treeSet, Scanner scanner) {
        T input;
        System.out.print("Enter element to add to the TreeSet: ");
        input = (T) scanner.nextLine();
        treeSet.add(input);
    }
}
