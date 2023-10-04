package session08_array_arraylist_linkedlist_wrapperclass.practice.shopping_cart;

public class ShoppingCart {

    public static void main(String[] args) {
        Product product1 = new Product("Soap", 8.99);
        Product product2 = new Product("Sponge", 14.28);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println("The total price is: " + cart.totalPrice());
    }
}
