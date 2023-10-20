package session14.challenge.last_challenge.models;

import java.util.*;

public class User {

    private ArrayList<ArrayList<Product>> listOfLists = new ArrayList<>();

    public void addShoppingList(ArrayList<Product> list) {
        listOfLists.add(list);
    }

    public void getMostUsedKElements() {
        Map<Product, Integer> hashMap = new HashMap<>();
        for (int index = 0; index < listOfLists.size(); index++) {
            for (int secondIndex = 0; secondIndex < listOfLists.get(index).size(); secondIndex++) {
                if (hashMap.containsKey(listOfLists.get(index).get(secondIndex))) {
                    hashMap.put(listOfLists.get(index).get(secondIndex), hashMap.get(listOfLists.get(index).get(secondIndex)) + 1);
                } else {
                    hashMap.put(listOfLists.get(index).get(secondIndex), 1);
                }
            }
        }

        List<Map.Entry<Product, Integer>> result = new ArrayList<>(hashMap.entrySet());
        result.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Product, Integer> element : result) {
            System.out.println("Product " + element.getKey().getName() + ", Number of times purchased: " + element.getValue());
        }
    }

    public User() {
        System.out.println("The user was created.");
    }

    public void createShoppingCartAtIndex(int index) {
        if (listOfLists.size() - 1 <= index) {
            listOfLists.add(index, new ArrayList<Product>());
        }
        System.out.println("Shopping cart created at index " + index + ".");
    }

    public void addProductToShoppingCartWithSpecificIndex(Product product, int index) {
        listOfLists.get(index).add(product);
        System.out.println("The product \"" + product.getName() + "\" was added to the shopping list with the index " + index + ".");
    }

    public void printShoppingCartWithSpecificIndex(int index) {
        System.out.println("All products in the shopping cart with the index number " + index + " are: ");
        String help = "";
        help += "[";
        for (Product element : listOfLists.get(index)) {
            help += element.getName();
            help += " ID:" + element.getId();
            help += ", ";
        }
        help = help.substring(0, help.length() - 2);
        help += "]";
        System.out.println(help);
    }
}
