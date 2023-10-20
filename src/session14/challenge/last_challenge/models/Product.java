package session14.challenge.last_challenge.models;

public class Product {

    private String name;
    private String id;

    public Product(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product[" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ']';
    }
}
