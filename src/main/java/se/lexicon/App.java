package se.lexicon;

public class App {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger("CheeseBurger", 12.99, "Beef", true);
        Burger chickenBurger = new Burger("ChickenBurger", 9.99, "Chicken", false);
        Fries smalllFries = new Fries(Size.SMALL, true, false);


        System.out.println("---------------");
        OrderItem orderItem1 = new OrderItem();
        orderItem1.addItem(cheeseBurger);
        orderItem1.addItem(chickenBurger);
        orderItem1.addItem(smalllFries);
        orderItem1.calculateTotal();
        orderItem1.displayItems();
    }
}
