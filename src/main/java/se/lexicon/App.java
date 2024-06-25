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

        Car car1 = new Car("Volvo", "V60", 2020);
        Car car2 = new Car("VW", "Id4");
        Car car3 = new Car("BMW", "X6");

        System.out.println("--------------------------");
        Person person1 = new Person("20200202-1111", "Person 1", "Person2@test.se", "1234567890");
        Person person2 = new Person("20200202-2222", "Person 2", "Person2@test.se", "9876543210");
        person1.addOwnedCar(car1);
        person2.addOwnedCar(car2);
        person1.removeOwnedCar(car1); //


        System.out.println(car1.getCarInfo());
        System.out.println(car2.getCarInfo());
        System.out.println(car3.getCarInfo());


    }
}
