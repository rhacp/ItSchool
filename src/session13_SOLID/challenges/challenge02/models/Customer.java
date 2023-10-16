package session13_SOLID.challenges.challenge02.models;

import java.util.ArrayList;

public class Customer {

    private String name;
    private String email;
    private String shippingAddress;
    private String billingAddress;
    private ArrayList<Product> shoppingCart = new ArrayList();
}
