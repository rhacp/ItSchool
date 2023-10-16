package session13_SOLID.challenges.challenge02.services;

import session13_SOLID.challenges.challenge01.models.Book;
import session13_SOLID.challenges.challenge02.models.Product;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> productList = new ArrayList();

    public void addProduct(Product product) {
        if (productList.size() == 0) {
            productList.add(product);
            System.out.print("Product \"" + product.getName() + "\" was added");
        } else {
            int helpCounter = 0;
            for (Product element : productList) {
                if (element.getName().equals(product.getName())) {
                    System.out.println("This product is already in the inventory. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                int secondHelp = 0;
                for (int index = productList.size() - 1; index >= 0; index--) {
                    if ((productList.get(index).getName()).compareToIgnoreCase(product.getName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                productList.add(secondHelp, product);
                System.out.print("Product \"" + product.getName() + "\" was added");
            }
        }
    }

    public void removeProduct(Product product) {
        productList.remove(product);
        System.out.println("The product was removed from the inventory.");
    }
}
