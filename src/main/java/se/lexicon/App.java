package se.lexicon;


public class App {
    public static void main(String[] args) {

        /*Car volvoObject = new Car();
        volvoObject.registrationNumber = "123 ABC";
        volvoObject.brand = "Volvo";
        volvoObject.model = "V60";
        volvoObject.year = 2020;
        System.out.println(volvoObject.getCarInfo());*/
        // Car Info -> null, Brand: null , Model: null, Year: 0

        Car car1 = new Car( "Volvo", "V60", 2020);
        Car car2 = new Car( "VW", "Id4");

        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());

    }
}
