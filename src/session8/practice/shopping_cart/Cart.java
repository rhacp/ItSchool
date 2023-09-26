package session8.practice.shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Added the product " + product.getName());
    }

    public void removeProduct(Product product) {
        productList.remove(product);
        System.out.println("Removed the product " + product.getName());
    }

    public double totalPrice() {
        double result = 0;
        for (Product element : productList) {
            result += element.getPrice();
        }
        return result;
    }
}
