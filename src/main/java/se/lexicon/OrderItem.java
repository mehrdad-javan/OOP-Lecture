package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;

public class OrderItem implements IOrderItem {

    private String id;
    private Product[] items;
    private LocalDateTime dateTime;
    private double totalPrice;
    private double tax;

    public OrderItem() {
        this.id = UUID.randomUUID().toString();
        this.dateTime = LocalDateTime.now();
        this.items = new Product[0];
    }

    @Override
    public void addItem(Product item) {
        if (item == null) throw new IllegalArgumentException("Item cannot be null");
        if (items == null) items = new Product[0];

        Product[] newItems = new Product[items.length + 1];
        System.arraycopy(items, 0, newItems, 0, items.length);
        newItems[newItems.length - 1] = item;
        items = newItems;
    }

    @Override
    public void removeItem(Product item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }

        int indexToRemove = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            Product[] newItems = new Product[items.length - 1];
            for (int i = 0, j = 0; i < items.length; i++) {
                if (i != indexToRemove) {
                    newItems[j++] = items[i];
                }
            }
            items = newItems;
        }

    }

    @Override
    public Product[] getItems() {
        return Arrays.copyOf(items, items.length);
    }

    @Override
    public void calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        this.totalPrice = total;
    }

    @Override
    public double calculateTotalWithTax() {
        // todo: needs completions
        return 0;
    }

    @Override
    public void displayItems() {
        System.out.println("Order Id: " + this.id);
        System.out.println("Date/Time: " + this.dateTime);
        System.out.println("Items:");
        for (Product item : items){
            System.out.println("    "+item.getDescription());
        }
        System.out.println("Total Order Cost: " + this.totalPrice);
    }

    public double getTotalPrice(){
        return totalPrice;
    }


}
