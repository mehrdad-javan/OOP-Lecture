package se.lexicon;

public interface IOrderItem {
    int MAX_ITEMS = 10;

    // static final fields
    // static methods
    // default methods
    // abstract methods

     void addItem(Product item);
     void removeItem(Product item);
     Product[] getItems();
     void calculateTotal();
     double calculateTotalWithTax();
     void displayItems();
     // declare more abstract methods as needed

}
