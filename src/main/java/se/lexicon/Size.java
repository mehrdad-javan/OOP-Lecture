package se.lexicon;

public enum Size {
    SMALL("S", 10.00), MEDIUM("M", 15.00), LARGE("L", 20.00);

    private final String label;
    private final double price;

    Size(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }

}
