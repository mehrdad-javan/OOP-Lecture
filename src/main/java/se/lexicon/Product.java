package se.lexicon;

public abstract class Product {

    // Fields
    private String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        // validate the param if needed
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return "Item: " + name + " , Price: " + price;
    }

    /*public final String getDescription() {
        return "Item: " + name + " , Price: " + price;
    }*/

    public abstract double calculateTax();

}
