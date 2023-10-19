package session14.challenge.hash_map;

import java.util.*;

public class ChallengeHashMap {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> hashMapCopy = new HashMap<>();
        Map<String, String> hashMapCopySecond = new HashMap<>(hashMap);
        addElementToHasMap(hashMap, "England", "London");
        addElementToHasMap(hashMap, "French", "Paris");
        addElementToHasMap(hashMap, "Romania", "Bucharest");
        System.out.println("");

        System.out.println("Your HashMap is:");
        printHashMap(hashMap);
        System.out.println("");

        System.out.println("The number of elements in your HashMap is: " + hashMap.size());
        System.out.println("The number of elements in your HashMap is: " + getNumberOfKeys(hashMap));
        System.out.println("");

        hashMapCopy = copyMap(hashMap);
        System.out.println("Your HashMap Copy is:");
        printHashMap(hashMapCopy);
        System.out.println("");

        removeMappings(hashMapCopy);
        System.out.println("Your HashMap Copy is:");
        printHashMap(hashMapCopy);
        System.out.println("");

        System.out.println("HashMap:");
        checkIfAnyEntryIsEmpty(hashMap);
        System.out.println("");
        System.out.println("HashMapCopy:");
        checkIfAnyEntryIsEmpty(hashMapCopy);
        System.out.println("");
        addElementToHasMap(hashMap, "", "");
        System.out.println("HashMap:");
        checkIfAnyEntryIsEmpty(hashMap);
        System.out.println("");

        /***
         * Cannot create shallow copy for a map without custom objects from my personal custom classes. This should be a
         * shallow copy, but it is in fact a deep copy as the values are not changing once with the first HashMap values.
         ***/
        System.out.println("Because the HashMap is <String, String> this will always be deep copy. It was copied at the " +
                "start of the program when the initial HashMap was empty and it remained empty even after adding new " +
                "entries to the original HasMap:");
        printHashMap(hashMapCopySecond);
        System.out.println("");

        System.out.println("Key to check if it has a mapping: " + "Romania");
        checkIfKeyExists(hashMap, "Romania");
        System.out.println(hashMap.containsKey("Romania"));
        System.out.println("");
        System.out.println("Key to check if it has a mapping: " + "Albania");
        checkIfKeyExists(hashMap, "Albania");
        System.out.println(hashMap.containsKey("Albania"));
        System.out.println("");

        System.out.println("Value to check if it has a mapping: " + "Bucharest");
        checkIfValueExists(hashMap, "Bucharest");
        System.out.println(hashMap.containsValue("Bucharest"));
        System.out.println("");
        System.out.println("Value to check if it has a mapping: " + "Amsterdam");
        checkIfValueExists(hashMap, "Amsterdam");
        System.out.println(hashMap.containsValue("Amsterdam"));
        System.out.println("");

        getKeyValue(hashMap, "Romania");
        System.out.println("\"" + hashMap.get("Romania") + "\"");
        System.out.println("");
        getKeyValue(hashMap, "");
        System.out.println("\"" + hashMap.get("") + "\"");
        System.out.println("");
        getKeyValue(hashMap, "Albania");
        System.out.println("\"" + hashMap.get("Albania") + "\"");
        System.out.println("");

        getAllKeys(hashMap);
        Set<String> keySet = hashMap.keySet();
        System.out.println(keySet);
        System.out.println("");

        getAllValues(hashMap);
        Collection<String> valueCollection = hashMap.values();
        System.out.println(valueCollection);
        System.out.println("");
    }

    //  CHALLENGE 12:
    private static void getAllValues(Map<String, String> hashMap) {
        /***
         * Collection<String> valueCollection = hashMap.values();
         * System.out.println(valueCollection);
         */

        String result = "[";
        for (String element : hashMap.values()) {
            result += element + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += "]";
        System.out.println(result);
    }

    //  CHALLENGE 11:
    private static void getAllKeys(Map<String, String> hashMap) {
        /***
         *        Set<String> keySet = hashMap.keySet();
         *        System.out.println(keySet);
         *
         *        - This will not keep the order of the elements (the order they were added in).
         *
         *        ---
         *
         *        - Neither the hard-codded version presented below keeps the order of elements. They provide the same
         *        result.
         */

        String result = "[";
        for (String element : hashMap.keySet()) {
            result += element + ", ";
        }
        result = result.substring(0, result.length() - 2);
        result += "]";
        System.out.println(result);
    }

    //  CHALLENGE 10:
    private static void getKeyValue(Map<String, String> hashMap, String key) {
        int help = 0;
//        hashMap.get(key);
        for (Map.Entry<String, String> element : hashMap.entrySet()) {
            if (element.getKey().equals(key)) {
                System.out.println("The value of the \"" + key + "\" key is: \"" + element.getValue() + "\"");
                help = 1;
                break;
            }
        }

        if (help == 0) {
            System.out.println("The key \"" + key + "\" does not exist.");
        }
    }

    //  CHALLENGE 09:
    private static void printHashMap(Map<String, String> hashMap) {
        if (hashMap.isEmpty()) {
            System.out.println("NULL");
        } else {
            for (Map.Entry<String, String> element : hashMap.entrySet()) {
                System.out.println("Country: " + element.getKey() + ", Capital City: " + element.getValue());
            }
        }
    }

    //  CHALLENGE 08:
    private static void checkIfValueExists(Map<String, String> hashMap, String value) {
        int help = 0;
        //hashMap.containsValue(value);
        for (String element : hashMap.values()) {
            if (element.equals(value)) {
                System.out.println("There is a mapping for the \"" + value + "\" value.");
                help = 1;
                break;
            }
        }

        if (help == 0) {
            System.out.println("This value does not exist.");
        }
    }

    //  CHALLENGE 07:
    private static void checkIfKeyExists(Map<String, String> hashMap, String key) {
        int help = 0;
        //hashMap.containsKey(key);
        for (String element : hashMap.keySet()) {
            if (element.equals(key)) {
                System.out.println("There is a mapping for the \"" + key + "\" key.");
                help = 1;
                break;
            }
        }

        if (help == 0) {
            System.out.println("This key does not exist.");
        }
    }

    //  CHALLENGE 06:
    private static void getShallowCopy(Map<String, String> hashMap) {
        /***
         * Cannot create a shallow copy of the map since it does not use any Objects from custom Classes.
         *
         * ---
         *
         * Map<String, String> hashMapCopy = new HashMap<>(hashMap);
         * - This will return a shallow copy only if you use custom Objects from custom Classes!!! If they are "primitive"
         * it will return a deep copy actually!!!
         *
         * ---
         *
         * hashMapCopy.putAll(hashMap);
         * - clone() method does the shallow copy. But here the values in the original and cloned hashmap will not affect
         * each other because primitive data type is used.
         * - This will return a deep copy of your map (new object, will not point to the same objects as the original,
         * will not get changed once you change the original map.
         */
    }

    //  CHALLENGE 05:
    private static void checkIfAnyEntryIsEmpty(Map<String, String> hashMap) {
        int help = 0;

        if (hashMap.isEmpty()) {
            help = 1;
            System.out.println("The Map is empty (NULL).");
        }
        for (Map.Entry<String, String> element : hashMap.entrySet()) {
            if (element.getKey().equals("") && element.getValue().equals("")) {
                System.out.println("The Map contains at least one empty entry (key and value empty).");
                help = 1;
                break;
            }
        }
        if (help == 0) {
            System.out.println("The Map does not contain any empty entry (key and value pair).");
        }
    }

    //  CHALLENGE 04:
    private static void removeMappings(Map<String, String> hashMap) {
//        hashMap.clear();
        Map<String, String> hashMapCopy = new HashMap<>(hashMap); //deep copy
        for (String element : hashMapCopy.keySet()) {
            hashMap.remove(element);
        }
        System.out.println("All mappings removed!");
    }

    //  CHALLENGE 03:
    private static Map<String, String> copyMap(Map<String, String> hashMap) {
        Map<String, String> hashMapCopy = new HashMap<>();

        /***
         * SHALLOW:
         * - Shallow Copy of Map = It just points to the same Objects as the original map, not actually copying it;
         * - if the original object has any references to other class objects(a class member is itself an object of some
         * other class),then only the reference of that object is cloned. Therefore, any changes in this referenced object
         * will be reflected on both the original and the cloned object.
         *
         * ---
         *
         * DEEP:
         * - Deep Copy of the Map = It actually creates new Objects identical to the ones in the original HashMap, thus
         * creating a new Map identical with our initial one.
         *
         * ---
         *
         * Map<String, String> hashMapCopy = new HashMap<>(hashMap);
         * - This will return a shallow copy only if you use custom Objects from custom Classes!!! If they are "primitive"
         * it will return a deep copy actually!!!
         *
         * hashMapCopy.putAll(hashMap);
         * - clone() method does the shallow copy. But here the values in the original and cloned hashmap will not affect
         * each other because primitive data type is used.
         * - This will return a deep copy of your map (new object, will not point to the same objects as the original,
         * will not get changed once you change the original map.
         */

        // THIS IS A DEEP COPY AS WE MANUALLY CREATED IT AS A NEW OBJECT
        for (Map.Entry<String, String> element : hashMap.entrySet()) {
            hashMapCopy.put(element.getKey(), element.getValue());
        }
        return hashMapCopy;
    }

    //  CHALLENGE 02:
    private static int getNumberOfKeys(Map<String, String> hashMap) {
        int result = 0;
//        result = hashMap.size();

        for (String element : hashMap.keySet()) {
            result++;
        }
        return result;
    }

    //  CHALLENGE 01:
    private static void addElementToHasMap(Map<String, String> hashMap, String key, String value) {
        hashMap.put(key, value);
        System.out.println("The key-value pair [(" + key + "), (" + value + ")] was added successfully!");
    }
}
