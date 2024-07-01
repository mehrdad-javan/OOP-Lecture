package se.lexicon;

public class App {
    public static void main(String[] args) {

        Burger cheeseBurger = new Burger("CheeseBurger", 12.99, "Beef", true);
        System.out.println(cheeseBurger.getDescription());
        Burger chickenBurger = new Burger("ChickenBurger", 9.99, "Chicken", false);
        System.out.println(chickenBurger.getDescription());

        Fries smalllFries = new Fries(Size.SMALL, true, false);
        System.out.println(smalllFries); // ?
    }
}
