package session14.challenge.hash_map;

import java.util.HashMap;
import java.util.Map;

public class ChallengeHashMap {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> hashMapCopy = new HashMap<>();
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

    }

    //    CHALLENGE 05:
    private static void checkIfAnyEntryIsEmpty(Map<String, String> hashMap) {

    }

    //    CHALLENGE 04:
    private static void removeMappings(Map<String, String> hashMap) {
//        hashMap.clear();
        Map<String, String> hashMapCopy = new HashMap<>(hashMap);
        for (String element : hashMapCopy.keySet()) {
            hashMap.remove(element);
        }
        System.out.println("All mappings removed!");
    }

    //    CHALLENGE 03:
    private static Map<String, String> copyMap(Map<String, String> hashMap) {
        Map<String, String> hashMapCopy = new HashMap<>();

//        Map<String, String> hashMapCopy = new HashMap<>(hashMap);
//        hashMapCopy.putAll(hashMap);

        for (Map.Entry<String, String> element : hashMap.entrySet()) {
            hashMapCopy.put(element.getKey(), element.getValue());
        }
        return hashMapCopy;
    }

    //    CHALLENGE 02:
    private static int getNumberOfKeys(Map<String, String> hashMap) {
        int result = 0;
//        result = hashMap.size();

        for (String element : hashMap.keySet()) {
            result++;
        }
        return result;
    }

    //    CHALLENGE 01:
    private static void addElementToHasMap(Map<String, String> hashMap, String key, String value) {
        hashMap.put(key, value);
        System.out.println("The key-value pair [(" + key + "), (" + value + ")] was added successfully!");
    }

    //    PRINT MAP:
    private static void printHashMap(Map<String, String> hashMap) {
        if (hashMap.isEmpty()) {
            System.out.println("NULL");
        } else {
            for (Map.Entry<String, String> element : hashMap.entrySet()) {
                System.out.println("Country: " + element.getKey() + ", Capital City: " + element.getValue());
            }
        }
    }
}
