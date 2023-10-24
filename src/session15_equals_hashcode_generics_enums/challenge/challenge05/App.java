package session15_equals_hashcode_generics_enums.challenge.challenge05;

public class App {

    public static void main(String[] args) {
        Product firstProduct = new Product();
        System.out.println("First product created:");
        firstProduct.setId("77gh89we22");
        System.out.println("");

        Product secondProduct = new Product();
        System.out.println("Second product created:");
        secondProduct.setId("77gh89we22");
        System.out.println("");

        System.out.println("firstProduct equals secondProduct: " + firstProduct.equals(secondProduct));
        System.out.println("firstProduct hashCode: " + firstProduct.hashCode());
        System.out.println("secondProduct hashCode: " + secondProduct.hashCode());
        System.out.println("");

        System.out.println("Second product:");
        secondProduct.setId("77885643");
        System.out.println("");

        System.out.println("firstProduct equals secondProduct: " + firstProduct.equals(secondProduct));
        System.out.println("firstProduct hashCode: " + firstProduct.hashCode());
        System.out.println("secondProduct hashCode: " + secondProduct.hashCode());
        System.out.println("");
    }
}
