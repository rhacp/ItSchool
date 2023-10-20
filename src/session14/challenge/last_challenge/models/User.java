package session14.challenge.last_challenge.models;

import java.util.ArrayList;

public class User {

    private ArrayList<ArrayList<Product>> listOfLists = new ArrayList<>();

//    public void addShoppingList(ArrayList<Product> list) {
//        listOfLists.add(list);
//    }


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
