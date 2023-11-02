package session14_collections.challenge;

import java.util.*;

public class ChallengeHashSet {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSetCopy = new HashSet<>(hashSet);//null copy as there were no elements added as this point
        Scanner scanner = new Scanner(System.in);

        //CHALLENGE 01:
        addElement(hashSet, scanner);
        addElement(hashSet, scanner);
        addElement(hashSet, scanner);
        System.out.println(" ");

        HashSet<String> secondHashSetCopy = new HashSet<>(hashSet);
        HashSet<String> thirdHashSetCopy = new HashSet<>(hashSet);

        //Nu tine ordinea in care adaugam elementele.
        System.out.println(hashSet);
        System.out.println(" ");

        //CHALLENGE 02:
        printSetElements(hashSet);
        System.out.println(" ");

        //CHALLENGE 03:
        printElementNumber(hashSet);
        System.out.println(hashSet.size());
        System.out.println(" ");

        //CHALLENGE 04:
        System.out.println(hashSetCopy);
        emptySet(secondHashSetCopy);
        System.out.println(secondHashSetCopy);
        thirdHashSetCopy.clear();
        System.out.println(thirdHashSetCopy);
        System.out.println(" ");

        //CHALLENGE 05:
        System.out.println("Is the set empty? " + isSetEmpty(hashSet));
        System.out.println("Is the set empty? " + hashSet.isEmpty());
        System.out.println("");

        //CHALLENGE 06:
        System.out.println(copySet(hashSet));
//        HashSet<String> secondHashSetCopy = new HashSet<>(hashSet);
        HashSet<String> fourthHashSetCopy = (HashSet<String>) hashSet.clone();
        System.out.println(fourthHashSetCopy);
        System.out.println(" ");

        //CHALLENGE 07:
//        String[] array = hashSet.toArray(new String[hashSet.size()]);
//        System.out.println(array);
//        Object[] arraySecond = hashSet.toArray();
//        System.out.println(arraySecond);
        HashSet<String> fifthHashSetCopy = new HashSet<>(hashSet);
        String[] result = fifthHashSetCopy.toArray(new String[fifthHashSetCopy.size()]);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(setToArray(hashSet)));
        System.out.println(" ");

        //CHALLENGE 08
        System.out.println(hashSetToTreeSet(hashSet));
        System.out.println(" ");

        //CHALLENGE 09
        System.out.println(setToArrayList(hashSet));
        System.out.println(" ");

        //CHALLENGE 10:
        System.out.println("Manual comparator between the two HashSet: " + compareHashSets(hashSet, fifthHashSetCopy));
        System.out.println("hashSet.equals(fifthHashSetCopy) = " + compareHashSets(hashSet, fifthHashSetCopy));
        System.out.println(" ");
        HashSet<String> testComparator = new HashSet<>();
        addElement(testComparator, scanner);
        addElement(testComparator, scanner);
        addElement(testComparator, scanner);
        addElement(testComparator, scanner);
        System.out.println(" ");
        System.out.println("Manual comparator between the two HashSet: " + compareHashSets(hashSet, testComparator));
        System.out.println("hashSet.equals(fifthHashSetCopy) = " + compareHashSets(hashSet, testComparator));
        System.out.println(" ");

        //CHALLENGE 11:
        System.out.println("Common Values: ");
        System.out.println(getCommonElements(hashSet, testComparator));
        System.out.println(" ");

        //CHALLENGE 12:
        System.out.println(hashSet);
        System.out.println(isSetEmpty(hashSet));
        System.out.println(removeAllElements(hashSet));
        System.out.println(isSetEmpty(hashSet));
        System.out.println(isSetEmpty(thirdHashSetCopy));
    }

    //  CHALLENGE 12:
    private static <T> HashSet<T> removeAllElements(HashSet<T> hashSet) {
        HashSet<T> copy = new HashSet<>(hashSet);
        for (T element : copy) {
            hashSet.remove(element);
        }

        return hashSet;
    }


    //  CHALLENGE 11:
    private static <T> HashSet<T> getCommonElements(HashSet<T> firstHashSet, HashSet<T> secondHashSet) {
        HashSet<T> result = new HashSet<>();
        for (T element : firstHashSet) {
            if (secondHashSet.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    //  CHALLENGE 10_2:
    private static <T> boolean compareHashSetsSecond(HashSet<T> firstHashSet, HashSet<T> secondHashSet) {
        int help = 0;
        if (firstHashSet.size() != secondHashSet.size()) {
            return false;
        } else {
            for (T element : firstHashSet) {
                help = 0;
                for (T element2 : secondHashSet) {
                    if (element.equals(element2)) {
                        help = 1;
                        break;
                    }
                }
                if (help == 0) {
                    break;
                }
            }
            if (help == 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    //  CHALLENGE 10
    private static <T> boolean compareHashSets(HashSet<T> firstHashSet, HashSet<T> secondHashSet) {
        if (firstHashSet.size() != secondHashSet.size()) {
            return false;
        } else {
            if (firstHashSet.equals(secondHashSet)) {
                return true;
            } else
                return false;
        }
    }

    //  CHALLENGE 09
    private static <T> ArrayList<T> setToArrayList(HashSet<T> hashSet) {
//        T[] y = new T[hashSet.size()];
        ArrayList<T> array = new ArrayList<>();
//        T[] array = (T[]) new Object[hashSet.size()];
        int index = 0;
        for (T element : hashSet) {
            array.add(element);
            index++;
        }

        return array;
    }

    //  CHALLENGE 08
    private static <T> TreeSet<T> hashSetToTreeSet(HashSet<T> hashSet) {
//        TreeSet<T> treeSet = new TreeSet<>(hashSet);
        TreeSet<T> treeSet1 = new TreeSet<>();
        treeSet1.addAll(hashSet);
        return treeSet1;
    }

    //  CHALLENGE 07
    private static <T> T[] setToArray(HashSet<T> hashSet) {
//        T[] y = new T[hashSet.size()];
//        ArrayList<T> array = new ArrayList<>();
        T[] array = (T[]) new Object[hashSet.size()];
        int index = 0;
        for (T element : hashSet) {
            array[index] = element;
            index++;
        }

        return array;
    }

    //  CHALLENGE 06:
    private static <T> HashSet<T> copySet(HashSet<T> hashSet) {
        HashSet<T> copy = new HashSet<>();
        for (T element : hashSet) {
            copy.add(element);
        }

        return copy;
    }

    //  CHALLENGE 05:
    private static boolean isSetEmpty(HashSet<String> hashSet) {
        if (hashSet.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    //  CHALLENGE 04
    private static void emptySet(HashSet<String> hashSet) {
        HashSet<String> copy = new HashSet<>(hashSet);
        for (String element : copy) {
            hashSet.remove(element);
        }
    }

    //  CHALLENGE 03
    private static void printElementNumber(HashSet<String> hashSet) {
        int result = 0;
        for (String element : hashSet) {
            result++;
        }

        System.out.println("Element number: " + result);
    }

    //  CHALLENGE 02
    private static void printSetElements(HashSet<String> hashSet) {
        for (String element : hashSet) {
            System.out.print(element + " ");
        }

        System.out.println(" ");

        //remember Iterator
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" ");
    }

    //  CHALLENGE 01
    private static <T> void addElement(HashSet<T> hashSet, Scanner scanner) {
        T input;
        System.out.print("Enter element to add to HashSet: ");
        input = (T) scanner.nextLine();
        hashSet.add(input);
    }
}
