package session14_collections.challenge.last_challenge.services;

import session14_collections.challenge.last_challenge.models.Product;

import java.util.ArrayList;
import java.util.Random;

public class ProductService {

    private ArrayList<Product> productList = new ArrayList<>();

    public void printInventory() {
        System.out.println("All products registered in the inventory: ");
        String help = "";
        help += "[";
        for (Product element : productList) {
            help += element.getName();
            help += " ID:" + element.getId();
            help += ", ";
        }
        help = help.substring(0, help.length() - 2);
        help += "]";
        System.out.println(help);
    }

    public Product getProductByName(String name) {
        for (Product element : productList) {
            if (element.getName() == name) {
                return element;
            }
        }
        return null;
    }

    public void deleteProduct(String name) {
        if (getProductByName(name) != null) {
            Product product = getProductByName(name);
            for (Product element : productList) {
                if (element.getName() == name) {
                    productList.remove(product);
                }
            }
        } else {
            System.out.println("There is no product with this name.");
        }
    }

    public void setUniqueProductId(Product product) {
        ID_LOOP:
        while (true) {
            final String help = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            final Random rand = new Random();
            int i = 8;
            String uid = "";
            while (i-- > 0) {
                uid += help.charAt(rand.nextInt(26));
            }
            product.setId(uid);

            for (Product element : productList) {
                if (element.getId() == product.getId()) {
                    break ID_LOOP;
                }
            }
            break;
        }
    }

    public void addProductToInventory(String name) {
        if (productList.isEmpty()) {
            Product product = new Product(name);
            setUniqueProductId(product);
            productList.add(product);
            System.out.println("Product \"" + product.getName() + "\" was added");
        } else {
            int helpCounter = 0;
            for (Product element : productList) {
                if (element.getName().equals(name)) {
                    System.out.println("This product is already in the inventory. Please try again.");
                    helpCounter = 1;
                    break;
                }
            }

            if (helpCounter == 0) {
                Product product = new Product(name);
                setUniqueProductId(product);
                int secondHelp = 0;
                for (int index = productList.size() - 1; index >= 0; index--) {
                    if ((productList.get(index).getName()).compareToIgnoreCase(product.getName()) < 0) {
                        secondHelp = index + 1;
                        break;
                    }
                }
                productList.add(secondHelp, product);
                System.out.println("Product \"" + product.getName() + "\" was added");
            }
        }
    }
}
