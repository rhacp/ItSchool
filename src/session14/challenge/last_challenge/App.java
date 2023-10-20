package session14.challenge.last_challenge;

import session14.challenge.last_challenge.models.User;
import session14.challenge.last_challenge.services.ProductService;

public class App {

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        productService.addProductToInventory("Soap");
        productService.addProductToInventory("Butter");
        productService.addProductToInventory("Butter");
        productService.addProductToInventory("Biscuits");
        productService.addProductToInventory("TV");
        productService.addProductToInventory("PC");
        productService.addProductToInventory("Mouse");
        productService.addProductToInventory("Speaker");
        productService.addProductToInventory("WebCam");
        productService.addProductToInventory("Lighter");
        System.out.println("");

        System.out.println(productService.getProductByName("Soap").toString());
        System.out.println(productService.getProductByName("Butter").toString());
        System.out.println("");

        productService.printInventory();
        System.out.println("");

        User user = new User();
        System.out.println("");

        user.createShoppingCartAtIndex(0);
        user.createShoppingCartAtIndex(1);
        System.out.println("");

        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Soap"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Butter"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Butter"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Butter"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Biscuits"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("TV"), 0);
        System.out.println("");

        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("TV"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("TV"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("TV"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Mouse"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Speaker"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Webcam"), 0);
        user.addProductToShoppingCartWithSpecificIndex(productService.getProductByName("Webcam"), 0);

        user.printShoppingCartWithSpecificIndex(0);
    }
}
