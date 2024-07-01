package se.lexicon;

public final class Burger extends Product {

    // name and price

    private String type;
    private boolean hasCheese;

    public Burger(String name, double price, String type, boolean hasCheese) {
        super(name, price);
        this.type = type;
        this.hasCheese = hasCheese;
    }

    @Override
    public String getDescription() {
        return "Name: " + super.getName() + " , Price: " + super.getPrice() + " , Type: " + this.type + " , Cheese: " + hasCheese;
    }

}
